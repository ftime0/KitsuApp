package com.example.kitsuapp.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.map
import com.example.domain.repositories.MangaRepository
import com.example.kitsuapp.data.base.BaseRepository
import com.example.kitsuapp.data.remote.apisevise.MangaApi
import com.example.kitsuapp.data.remote.dtos.manga.toDomain
import com.example.kitsuapp.data.remote.sources.MangaPagingSource
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MangaRepositoryImpl @Inject constructor(
    private val api: MangaApi
) : BaseRepository(), MangaRepository {

    fun fetchPageManga() = Pager(
        PagingConfig(
            pageSize = 20,
            initialLoadSize = 10
        )
    ) { MangaPagingSource(api) }.flow.map { data -> data.map { it.toDomain() } }


    override fun fetchManga(id: String) = doRequest {
        api.fetchMangaID(id).toDomain()

    }
}