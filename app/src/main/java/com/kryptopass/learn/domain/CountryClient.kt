package com.kryptopass.learn.domain

interface CountryClient {
    suspend fun getCountryList(): List<SimpleCountry>
    suspend fun getCountry(code: String): DetailedCountry?
}