package com.example.kitsuapp.presentation.models.manga

import com.example.domain.models.manga.LinksXXXModel


data class LinksXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXModel.toUI() = LinksXXXUI(
    self, related
)