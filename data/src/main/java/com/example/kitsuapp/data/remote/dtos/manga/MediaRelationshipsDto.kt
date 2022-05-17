package com.example.kitsuapp.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.MediaRelationshipsModel

data class MediaRelationships(
    @SerializedName("links")
    val links: LinksXXXXXXX
)

fun MediaRelationships.toDomain() =
    MediaRelationshipsModel(links.toDomain())