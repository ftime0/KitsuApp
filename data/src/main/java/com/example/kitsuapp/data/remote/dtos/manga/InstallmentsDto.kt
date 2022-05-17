package com.example.kitsuapp.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.InstallmentsModel

data class Installments(
    @SerializedName("links")
    val links: LinksXXXX
)

fun Installments.toDomain() =
    InstallmentsModel(links.toDomain())