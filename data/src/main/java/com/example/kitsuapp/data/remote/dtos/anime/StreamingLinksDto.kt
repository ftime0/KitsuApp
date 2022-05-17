package com.example.kitsuapp.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.domain.models.anime.StreamingLinksModel

data class StreamingLinks(
    @SerializedName("links")
    val links: LinksXXXXXXXXX
)

fun StreamingLinks.toDomain() = StreamingLinksModel(links.toDomain())