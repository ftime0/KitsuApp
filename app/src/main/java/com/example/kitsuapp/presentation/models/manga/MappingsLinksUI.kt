package com.example.kitsuapp.presentation.models.manga

import com.example.domain.models.manga.LinksXXXXXModel

data class LinksXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXModel.toUI() = LinksXXXXXUI(self, related)
