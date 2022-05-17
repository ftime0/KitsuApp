package com.example.kitsuapp.di

import com.example.kitsuapp.data.repositories.AnimeRepositoryImpl
import com.example.domain.repositories.AnimeRepository
import com.example.domain.repositories.AuthenticationRepository
import com.example.domain.repositories.MangaRepository
import com.example.kitsuapp.data.repositories.AuthenticationRepositoryImpl
import com.example.kitsuapp.data.repositories.MangaRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun provideAnimeRepository(repositoryImpl: AnimeRepositoryImpl): AnimeRepository

    @Binds
    abstract fun provideMangaRepository(mangaRepositoryImpl: MangaRepositoryImpl): MangaRepository

    @Binds
    abstract  fun provideAuthenticationApiService(authenticationRepositoryImpl: AuthenticationRepositoryImpl) : AuthenticationRepository
}