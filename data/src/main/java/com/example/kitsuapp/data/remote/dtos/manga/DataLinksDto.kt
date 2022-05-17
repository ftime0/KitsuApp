package com.example.kitsuapp.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.LinksModel

data class Links(
    @SerializedName("self")
    val self: String
)

fun Links.toDomain() = LinksModel(
    self
)