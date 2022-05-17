package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.AnimeProductionsModel


data class AnimeProductionsUI(
    val links: LinksXXXXXXXXXXUI
)

fun AnimeProductionsModel.toUI() = AnimeProductionsUI(links.toUI())
