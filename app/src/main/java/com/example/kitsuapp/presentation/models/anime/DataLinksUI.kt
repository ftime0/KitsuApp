package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.LinksModel


data class LinksUI(
    val self: String
)

fun LinksModel.toUI() = LinksUI(
    self
)
