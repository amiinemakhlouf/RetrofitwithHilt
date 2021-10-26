package com.example.apiwithhilt.data.api

import com.example.apiwithhilt.data.models.Country
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("col")
    suspend fun  getCountry():Response<Country>
}