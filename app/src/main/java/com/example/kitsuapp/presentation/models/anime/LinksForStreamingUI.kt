package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXXXModel


data class LinksXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXModel.toUI() = LinksXXXXXXXXXUI(self, related)
