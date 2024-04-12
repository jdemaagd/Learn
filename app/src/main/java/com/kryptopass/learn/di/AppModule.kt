package com.kryptopass.learn.di

import com.apollographql.apollo3.ApolloClient
import com.kryptopass.learn.data.ApolloCountryClient
import com.kryptopass.learn.domain.CountryClient
import com.kryptopass.learn.domain.GetCountryListUseCase
import com.kryptopass.learn.domain.GetCountryUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApolloClient(): ApolloClient {
        return ApolloClient.Builder()
            .serverUrl("https://countries.trevorblades.com/graphql")
            .build()
    }

    @Provides
    @Singleton
    fun provideCountryClient(apolloClient: ApolloClient): CountryClient {
        return ApolloCountryClient(apolloClient)
    }

    @Provides
    @Singleton
    fun provideGetCountryListUseCase(countryClient: CountryClient): GetCountryListUseCase {
        return GetCountryListUseCase(countryClient)
    }

    @Provides
    @Singleton
    fun provideGetCountryUseCase(countryClient: CountryClient): GetCountryUseCase {
        return GetCountryUseCase(countryClient)
    }
}