package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.LinksXModel


data class LinksXUI(
    val self: String,
    val related: String
)

fun LinksXModel.toUI() = LinksXUI(self, related)
