package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.MediaRelationshipsModel


data class MediaRelationshipsUI(
    val links: LinksXXXXXXXUI
)

fun MediaRelationshipsModel.toUI() = MediaRelationshipsUI(links.toUI())
