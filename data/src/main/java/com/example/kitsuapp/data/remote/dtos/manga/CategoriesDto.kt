package com.example.kitsuapp.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.CategoriesModel

data class Categories(
    @SerializedName("links")
    val links: LinksXX
)

fun Categories.toDomain() = CategoriesModel(
    links.toDomain()
)