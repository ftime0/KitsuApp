package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXModel


data class LinksXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXModel.toUI() = LinksXXXXXXXUI(self, related)
