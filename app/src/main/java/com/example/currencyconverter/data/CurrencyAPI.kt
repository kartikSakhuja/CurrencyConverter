package com.example.currencyconverter.data

import com.example.currencyconverter.data.models.CurrencyResponseX
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyAPI {

    @GET("/latest")
    suspend fun getRates(
        @Query ("Base") base : String,
        @Query ("access_key") access_key : String,
        @Query("format")  format : String
    ): Response<CurrencyResponseX>

}