package com.example.kitsuapp.di

import com.example.kitsuapp.data.remote.NetworkClient
import com.example.kitsuapp.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideAnimeApiService(
        networkClient: NetworkClient
    )= networkClient.provideAnimeApiService()


    @Singleton
    @Provides
    fun provideMangaApiService(networkClient: NetworkClient) =
        networkClient.provideMangaApiService()

    @Singleton
    @Provides
    fun provideAuthenticationApiService(authenticationClient: NetworkClient.AuthenticationClient) =
        authenticationClient.provideAuthenticationApiService()

}