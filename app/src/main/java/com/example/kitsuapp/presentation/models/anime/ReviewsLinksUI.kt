package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXModel


data class LinksXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXModel.toUI() = LinksXXXXXXUI(self, related)
