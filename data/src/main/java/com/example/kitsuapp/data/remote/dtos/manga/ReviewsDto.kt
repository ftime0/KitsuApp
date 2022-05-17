package com.example.kitsuapp.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.ReviewsModel

data class Reviews(
    @SerializedName("links")
    val links: LinksXXXXXX
)

fun Reviews.toDomain() = ReviewsModel(links.toDomain())