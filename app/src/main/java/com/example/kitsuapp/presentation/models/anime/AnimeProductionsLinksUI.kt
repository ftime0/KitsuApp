package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXXXXModel


data class LinksXXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXUI(self, related)
