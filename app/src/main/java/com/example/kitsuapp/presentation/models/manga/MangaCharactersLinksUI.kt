package com.example.kitsuapp.presentation.models.manga

import com.example.domain.models.manga.LinksXXXXXXXXXModel

data class LinksXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXModel.toUI() = LinksXXXXXXXXXUI(self, related)
