package com.example.kitsuapp.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.domain.models.anime.EpisodesModel

data class Episodes(
    @SerializedName("links")
    val links: LinksXXXXXXXX
)

fun Episodes.toDomain() = EpisodesModel(
    links.toDomain()
)