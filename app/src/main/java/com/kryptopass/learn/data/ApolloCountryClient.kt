package com.kryptopass.learn.data

import com.apollographql.apollo3.ApolloClient
import com.kryptopass.CountryListQuery
import com.kryptopass.CountryQuery
import com.kryptopass.learn.domain.CountryClient
import com.kryptopass.learn.domain.DetailedCountry
import com.kryptopass.learn.domain.SimpleCountry

class ApolloCountryClient(
    private val apolloClient: ApolloClient
): CountryClient {

    override suspend fun getCountryList(): List<SimpleCountry> {
        return apolloClient
            .query(CountryListQuery())
            .execute()
            .data
            ?.countryList
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