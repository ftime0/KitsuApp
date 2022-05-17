package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXXModel


data class LinksXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXModel.toUI() = LinksXXXXXXXXUI(self, related)
