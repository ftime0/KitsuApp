package com.example.kitsuapp.presentation.models.manga

import com.example.domain.models.manga.LinksXXModel

data class LinksXXUI(
    val self: String,
    val related: String
)

fun LinksXXModel.toUI() = LinksXXUI(self, related)
