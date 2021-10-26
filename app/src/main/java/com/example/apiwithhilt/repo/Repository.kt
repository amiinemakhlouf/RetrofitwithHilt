package com.example.apiwithhilt.repo

import com.example.apiwithhilt.data.api.ApiService
import javax.inject.Inject

class Repository @Inject constructor  (val apiService: ApiService) {

    suspend fun getCountries() = apiService.getCountry()

}