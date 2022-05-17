package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXXXXXXModel


data class LinksXXXXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXXUI(self, related)
