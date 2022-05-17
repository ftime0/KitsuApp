package com.example.kitsuapp.data.remote.dtos.anime


import com.example.domain.models.anime.LinksXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXX.toDomain() = LinksXXXXXXXModel(
    self, related
)