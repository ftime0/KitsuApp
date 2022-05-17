package com.example.kitsuapp.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.LargeModel

data class Large(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun Large.toDomain() = LargeModel(width, height)