package com.example.kitsuapp.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.LinksXXXXXXXXModel

data class LinksXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String

)

fun LinksXXXXXXXX.toDomain() = LinksXXXXXXXXModel(
    self, related
)