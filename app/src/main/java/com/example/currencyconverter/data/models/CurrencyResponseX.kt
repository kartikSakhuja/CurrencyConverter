package com.example.currencyconverter.data.models

data class CurrencyResponseX(
    val base: String,
    val date: String,
    val rates: RatesX,
    val success: Boolean,
    val timestamp: Int
)