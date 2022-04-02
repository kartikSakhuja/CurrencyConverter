package com.example.currencyconverter.main

import com.example.currencyconverter.data.models.CurrencyResponseX
import com.example.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates (base : String,access_key : String,format : String) : Resource<CurrencyResponseX>
}