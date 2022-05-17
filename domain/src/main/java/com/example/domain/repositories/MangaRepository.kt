package com.example.domain.repositories

import com.example.domain.either.Either
import com.example.domain.models.manga.SingleMangaModel
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchManga(id: String): Flow<Either<String, SingleMangaModel>>
}