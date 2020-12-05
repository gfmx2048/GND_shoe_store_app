package com.udacity.shoestore.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.R
import com.udacity.shoestore.isValidEmail
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.repositories.UserRepository

class MainActivityViewModel : ViewModel() {
    var shoes = mutableListOf<Shoe>()
    val user = UserRepository.user

    val newShoe = Shoe("",0.0,"","", listOf(R.drawable.ic_shoes))

    private val _newShoeLD = MutableLiveData<Shoe?>()
    val newShoeLD: LiveData<Shoe?>
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
        createShoes()
    }

//We can use this to create random dummy data
//    private fun createRandomShoes(numberOfShoes:Int): MutableList<Shoe>{
//        val shoeList = mutableListOf<Shoe>()
//        for (i in 0..numberOfShoes){
//            shoeList.add(Shoe(getRandomString(Random.nextInt(5,7)), Random.nextInt(39,45).toDouble(),"Company$i","description$i", listOf(R.drawable.nike_one,R.drawable.nike_two,R.drawable.adidas_one)))
//        }
//        return shoeList
//    }
//
//    private fun getRandomString(length: Int) : String {
//        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
//        return (1..length)
//            .map { allowedChars.random() }
//            .joinToString("")
//    }

    private fun createShoes(){
        shoes.add(Shoe("Air Force 1 '07 low-top sneakers",43.0,"Nike","Black leather Air Force 1 '07 low-top sneakers from Nike featuring a signature Nike swoosh, a perforated style, a round toe, a lace fastening and a flat rubber sole.", listOf(R.drawable.nike_one)))
        shoes.add(Shoe("Air Max 270 sneakers",44.5,"Nike","Green rubber Air Max 270 sneakers from Nike featuring a round toe, a flat sole, a pull tab at the rear, a signature Nike swoosh, a logo patch at the tongue and a lace fastening. These styles are supplied by a premium sneaker marketplace. Stocking only the most sought-after footwear, they source and curate some of the most hard to find sneakers from around the world.", listOf(R.drawable.nike_two)))
        shoes.add(Shoe("ADIDAS STYCON ALL COURT SHOES",42.0,"adidas","This adidas Stycon all court shoe is a revolution for the tennis world! This shoe will be worn by Stefanos Tsitsipas and Kristina Mladenovic. The adidas shoe offers comfort, support and will allow you to move freely. This innovation responds to high level and demanding players' needs. The black design will bring elegance to your outfits.", listOf(R.drawable.adidas_one)))
        shoes.add(Shoe("Supreme Air Force",39.0,"Nike","The Supreme x Nike Air Force 1 Low “Box Logo Black” takes a less-is-more approach in design and is part of the “World Famous” streetwear brand’s Spring/Summer 2020 collaboration with Nike. Supreme tones down the use of aggressive branding and instead opts for a simple and subtle design, featuring the iconic red Box Logo on the heel of a standard black-on-black Air Force 1 Low. A silver “AF1” emblem covers the bottom of the laces near the perforated toe, while tonal Nike Air branding on the tongue tab and heel complete the look. Release date: Spring 2020.", listOf(R.drawable.nike_one)))
        shoes.add(Shoe("Jordan 1 sneakers",43.0,"Nike","Jordan 1 sneakers.", listOf(R.drawable.nike_two)))
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
            _newShoeLD.value = newShoe.copy()
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

    fun clearShoe(){
        _newShoeLD.value = null
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