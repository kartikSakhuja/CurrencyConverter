package com.example.currencyconverter.main

import android.util.Log
import com.example.currencyconverter.data.CurrencyAPI
import com.example.currencyconverter.data.models.CurrencyResponseX
import com.example.currencyconverter.util.Resource
import java.lang.Exception
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(
    private val api : CurrencyAPI
    ) : MainRepository
    {
        override suspend fun getRates(base: String, access_key: String, format: String): Resource<CurrencyResponseX> {
            return try {
              val response = api.getRates(base,access_key,format)
                val result = response.body()
                Log.d("Request Code ", response.code().toString())
                Log.d("Response Data", response.toString())

                if (response.isSuccessful && result != null){
                    Resource.Success(result)
                }
                else{
                   Resource.Error(response.message())
                }
            } catch (e : Exception){
                Resource.Error(e.message ?: "An Error Occured!")
        }
    }
}