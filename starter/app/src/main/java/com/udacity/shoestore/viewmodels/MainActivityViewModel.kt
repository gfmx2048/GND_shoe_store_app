package com.udacity.shoestore.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.R
import com.udacity.shoestore.isValidEmail
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.models.User
import com.udacity.shoestore.repositories.UserRepository
import kotlin.random.Random

class MainActivityViewModel : ViewModel() {
    var shoes = mutableListOf<Shoe>()
    val user = UserRepository.user

    val newShoe = Shoe("",0.0,"","", listOf(R.drawable.ic_shoes))

    private val _newShoeLD = MutableLiveData<Shoe>()
    val newShoeLD: LiveData<Shoe>
        get() = _newShoeLD

    /**
     * We are going to return the resource id of the string, so as to avoid passing context in viewModel.
     * We could extend :AndroidViewModel and get the applicationContext if it was necessary
     */
    private val _error = MutableLiveData<Int?>()
    val error: LiveData<Int?>
        get() = _error

    private val _closeFrag = MutableLiveData<Boolean?>()
    val closeFrag: LiveData<Boolean?>
        get() = _closeFrag

    private val _hideKeyboard = MutableLiveData<Boolean?>()
    val hideKeyboard: LiveData<Boolean?>
        get() = _hideKeyboard

    private val _login = MutableLiveData<Boolean?>()
    val login: LiveData<Boolean?>
        get() = _login

    init {
        shoes = createRandomShoes(6)
    }


    private fun createRandomShoes(numberOfShoes:Int): MutableList<Shoe>{
        val shoeList = mutableListOf<Shoe>()
        for (i in 0..numberOfShoes){
            shoeList.add(Shoe(getRandomString(Random.nextInt(5,7)), Random.nextInt(39,45).toDouble(),"Company$i","description$i", listOf(R.drawable.nike_one,R.drawable.nike_two,R.drawable.adidas_one)))
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
                _error.value = R.string.please_add_shoe_name
                return
            }

            if(newShoe.company.isEmpty()){
                _error.value =R.string.please_add_a_company
                return
            }

            if(newShoe.description.isEmpty()){
                _error.value =R.string.please_add_a_description
                return
            }

            //I will use a check for europeans size here :)
            if(newShoe.size < 20.0){
                _error.value =R.string.please_add_a_valid_shoe_size
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

    fun clearLogin(){
        _login.value = null
    }

    fun loginUser(){
        _hideKeyboard.value = true
        if(!user.email.isValidEmail()){
            _error.value = R.string.please_add_a_valid_email
            return
        }

        if(user.password.isNullOrEmpty() || (user.password?.length!=null && user.password!!.length< 5)){
            _error.value =R.string.please_add_a_valid_pwd
            return
        }

        _login.value = true
    }

    fun loginAlreadyExistingUser(){
        _hideKeyboard.value = true
        if(user.email.isNullOrEmpty() || user.password.isNullOrEmpty()){
            _error.value =R.string.user_does_not_exist
            return
        }

        _login.value = true
    }
}