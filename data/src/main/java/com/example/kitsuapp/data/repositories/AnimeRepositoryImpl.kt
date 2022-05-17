package com.example.kitsuapp.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.map
import com.example.domain.either.Either
import com.example.domain.models.anime.SingleAnimeModel
import com.example.domain.repositories.AnimeRepository
import com.example.kitsuapp.data.base.BaseRepository
import com.example.kitsuapp.data.remote.apisevise.AnimeApi
import com.example.kitsuapp.data.remote.dtos.anime.toDomain
import com.example.kitsuapp.data.remote.sources.AnimePagingSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(private val api: AnimeApi) :
    BaseRepository(), AnimeRepository {
    fun fetchPageAnime() =
        Pager(PagingConfig(pageSize = 20, initialLoadSize = 10)) {
            AnimePagingSource(api)
        }.flow.map { data -> data.map { it.toDomain() } }



    override fun fetchAnime(id: String) = doRequest{
        api.fetchAnimeID(id).toDomain()
    }
}

