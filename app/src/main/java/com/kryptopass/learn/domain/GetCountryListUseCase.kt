package com.kryptopass.learn.domain

class GetCountryListUseCase(
    private val countryClient: CountryClient
) {

    suspend fun execute(): List<SimpleCountry> {
        return countryClient
            .getCountryList()
            .sortedBy { it.name }
    }
}