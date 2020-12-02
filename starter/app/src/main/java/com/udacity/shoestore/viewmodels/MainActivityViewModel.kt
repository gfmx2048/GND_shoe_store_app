package com.udacity.shoestore.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe
import kotlin.random.Random

class MainActivityViewModel : ViewModel() {
    private val _shoes = MutableLiveData<List<Shoe>>()
    val shoes: LiveData<List<Shoe>>
        get() = _shoes

    init {
        _shoes.value = createRandomShoes(6)
    }


    private fun createRandomShoes(numberOfShoes:Int): List<Shoe>{
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

    fun saveShoe(name: String, company: String, description: String, size: Double) {
        val currentShoes: MutableList<Shoe> = _shoes.value?.toMutableList()?: mutableListOf()
        currentShoes.add(Shoe(name,size,company,description, mutableListOf()))
        _shoes.postValue(currentShoes)
    }
}