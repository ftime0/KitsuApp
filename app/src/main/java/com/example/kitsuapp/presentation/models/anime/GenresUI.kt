package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.GenresModel


data class GenresUI(
    val linksXUI: LinksXUI
)

fun GenresModel.toUI() = GenresUI(linksXModel.toUI())
