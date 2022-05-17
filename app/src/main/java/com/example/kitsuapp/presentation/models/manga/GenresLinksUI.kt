package com.example.kitsuapp.presentation.models.manga

import com.example.domain.models.manga.LinksXModel

data class LinksXUI(
    val self: String,
    val related: String
)

fun LinksXModel.toUI() = LinksXUI(self, related)
