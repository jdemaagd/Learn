package com.kryptopass.learn.data

import com.apollographql.apollo3.ApolloClient
import com.kryptopass.CountriesQuery
import com.kryptopass.CountryQuery
import com.kryptopass.learn.domain.CountryClient
import com.kryptopass.learn.domain.DetailedCountry
import com.kryptopass.learn.domain.SimpleCountry

class ApolloCountryClient(
    private val apolloClient: ApolloClient
): CountryClient {

    override suspend fun getCountries(): List<SimpleCountry> {
        return apolloClient
            .query(CountriesQuery())
            .execute()
            .data
            ?.countries
            ?.map { it.toSimpleCountry() }
            ?: emptyList()
    }

    override suspend fun getCountry(code: String): DetailedCountry? {
        return apolloClient
            .query(CountryQuery(code))
            .execute()
            .data
            ?.country
            ?.toDetailedCountry()
    }
}