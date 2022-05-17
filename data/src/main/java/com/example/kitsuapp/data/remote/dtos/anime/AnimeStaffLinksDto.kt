package com.example.kitsuapp.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.domain.models.anime.LinksXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXXModel(
    self, related
)