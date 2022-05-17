package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXModel


data class LinksXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXModel.toUI() = LinksXXXXUI(self, related)
