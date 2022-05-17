package com.example.kitsuapp.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.domain.models.anime.MappingsModel

data class Mappings(
    @SerializedName("links")
    val links: LinksXXXXX
)

fun Mappings.toDomain() = MappingsModel(links.toDomain())