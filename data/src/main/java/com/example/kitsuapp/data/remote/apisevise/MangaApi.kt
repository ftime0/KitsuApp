package com.example.kitsuapp.data.remote.apisevise

import com.example.kitsuapp.data.remote.dtos.manga.MangaListDto
import com.example.kitsuapp.data.remote.dtos.manga.SingleMangaDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MangaApi {

    @GET("manga")
    suspend fun fetchManga(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int
    ): MangaListDto

    @GET("manga/{id}")
    suspend fun fetchMangaID(@Path("id") id: String): SingleMangaDto
}