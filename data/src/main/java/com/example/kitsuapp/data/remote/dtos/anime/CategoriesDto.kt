package com.example.kitsuapp.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.domain.models.anime.CategoriesModel

data class Categories(
    @SerializedName("links")
    val links: LinksXX
)

fun Categories.toDomain() = CategoriesModel(
    links.toDomain()
)