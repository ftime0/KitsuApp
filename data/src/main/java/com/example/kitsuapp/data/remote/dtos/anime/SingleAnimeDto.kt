package com.example.kitsuapp.data.remote.dtos.anime

import com.google.gson.annotations.SerializedName
import com.example.domain.models.anime.SingleAnimeModel

data class SingleAnimeDto(
    @SerializedName("data")
    val data: AnimeDataDto,
)

fun SingleAnimeDto.toDomain() = SingleAnimeModel(data.toDomain())
