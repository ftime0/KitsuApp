package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.StreamingLinksModel


data class StreamingLinksUI(
    val links: LinksXXXXXXXXXUI
)

fun StreamingLinksModel.toUI() = StreamingLinksUI(links.toUI())
