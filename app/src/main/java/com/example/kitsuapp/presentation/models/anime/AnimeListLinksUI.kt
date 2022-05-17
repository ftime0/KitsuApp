package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXXXXXXXModel


data class LinksXXXXXXXXXXXXXUI(
    val first: String,
    val prev: String?,
    val next: String,
    val last: String
)

fun LinksXXXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXXXUI(first, prev, next, last)
