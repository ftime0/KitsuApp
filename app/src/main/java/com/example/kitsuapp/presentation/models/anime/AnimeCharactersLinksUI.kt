package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXXXXXModel


data class LinksXXXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXUI(self, related)
