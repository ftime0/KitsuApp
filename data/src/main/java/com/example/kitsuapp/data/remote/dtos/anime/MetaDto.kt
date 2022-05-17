package com.example.kitsuapp.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.domain.models.anime.MetaModel

data class Meta(
    @SerializedName("dimensions")
    val dimensions: Dimensions
)

fun Meta.toDomain() = MetaModel(dimensions.toDomain())