package com.example.apiwithhilt.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apiwithhilt.data.models.Country
import com.example.apiwithhilt.repo.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val repository: Repository) :ViewModel(){
    var reponse = MutableLiveData<Country>()
    fun getCountry() {
        viewModelScope.launch (Dispatchers.IO){
            val response = repository.getCountries()
            if (response.isSuccessful) {
                withContext(Main){
                    reponse.value = response.body()

                }
            }
            else
                Log.d("test"," not working at all")
        }

    }

}
