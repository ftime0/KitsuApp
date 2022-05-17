package com.example.kitsuapp.presentation.models.manga

import com.example.domain.models.manga.LinksXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXUI(
    val first: String,
    val prev: String?,
    val next: String,
    val last: String
)

fun LinksXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXUI(first, prev, next, last)
