package com.example.kitsuapp.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.domain.models.anime.AnimeCharactersModel

data class AnimeCharactersDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXX
)

fun AnimeCharactersDto.toDomain() = AnimeCharactersModel(
    links.toDomain()

)