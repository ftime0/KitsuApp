package com.example.kitsuapp.data.remote.dtos.anime


import com.example.domain.models.anime.LinksXXModel
import com.google.gson.annotations.SerializedName

data class LinksXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXX.toDomain() = LinksXXModel(
    self, related
)