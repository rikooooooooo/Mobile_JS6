package com.example.js6.api



import com.example.js6.ResponseMorty
import retrofit2.http.GET
import retrofit2.Call

interface ApiService {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>
}