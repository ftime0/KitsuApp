package com.example.kitsuapp.data.remote.apisevise

import com.example.kitsuapp.data.remote.dtos.anime.AnimeListDto
import com.example.kitsuapp.data.remote.dtos.anime.SingleAnimeDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AnimeApi {
    @GET("anime")
    suspend fun fetchAnime(
        @Query("page[limit]") pageLimit: Int,
        @Query("page[offset]") pageOffset: Int,
    ): AnimeListDto

    @GET("anime/{id}")
    suspend fun fetchAnimeID(@Path("id") id: String): SingleAnimeDto

}