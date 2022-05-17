package com.example.domain.repositories

import com.example.domain.either.Either
import com.example.domain.models.anime.SingleAnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchAnime(id: String): Flow<Either<String, SingleAnimeModel>>
}