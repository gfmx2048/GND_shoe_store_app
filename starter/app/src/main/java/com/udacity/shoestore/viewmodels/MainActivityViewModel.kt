package com.udacity.shoestore.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe
import kotlin.random.Random

class MainActivityViewModel : ViewModel() {
    var shoes = mutableListOf<Shoe>()

    val newShoe = Shoe("",0.0,"","")

    private val _newShoeLD = MutableLiveData<Shoe>()
    val newShoeLD: LiveData<Shoe>
        get() = _newShoeLD

    private val _error = MutableLiveData<String?>()
    val error: LiveData<String?>
        get() = _error

    private val _closeFrag = MutableLiveData<Boolean?>()
    val closeFrag: LiveData<Boolean?>
        get() = _closeFrag

    private val _hideKeyboard = MutableLiveData<Boolean?>()
    val hideKeyboard: LiveData<Boolean?>
        get() = _hideKeyboard

    init {
        shoes = createRandomShoes(6)
    }


    private fun createRandomShoes(numberOfShoes:Int): MutableList<Shoe>{
        val shoeList = mutableListOf<Shoe>()
        for (i in 0..numberOfShoes){
            shoeList.add(Shoe(getRandomString(Random.nextInt(5,7)), Random.nextInt(39,45).toDouble(),"Company$i","description$i", listOf("daniel_storek_adidas.jpg","","")))
        }
        return shoeList
    }

    private fun getRandomString(length: Int) : String {
        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }

    fun saveShoe() {
            _hideKeyboard.value = true
            if(newShoe.name.isEmpty()){
                _error.value = "Please add a shoe name"
                return
            }

            if(newShoe.company.isEmpty()){
                _error.value ="Please add a company"
                return
            }

            if(newShoe.description.isEmpty()){
                _error.value ="Please add a description"
                return
            }

            //I will use a check for europeans size here :)
            if(newShoe.size < 20.0){
                _error.value ="Please add a valid shoe size"
                return
            }
            _newShoeLD.value = newShoe
             close()
    }

    fun clearError(){
        _error.value = null
    }

    fun close(){
        _closeFrag.value = true
    }

    fun clearClose(){
        _closeFrag.value = null
    }

    fun clearHideKeyboard(){
        _hideKeyboard.value = null
    }
}