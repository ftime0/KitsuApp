package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.AnimeCharactersModel


data class AnimeCharactersUI(
    val links: LinksXXXXXXXXXXXUI
)

fun AnimeCharactersModel.toUI() = AnimeCharactersUI(links.toUI())
