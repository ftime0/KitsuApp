package com.example.kitsuapp.data.remote.dtos.anime


import com.example.domain.models.anime.LinksXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXX.toDomain() = LinksXXXXXModel(
    self, related
)