package com.example.kitsuapp.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.ChaptersModel

data class Chapters(
    @SerializedName("links")
    val links: LinksXXXXXXXX
)

fun Chapters.toDomain() = ChaptersModel(
    links.toDomain()
)