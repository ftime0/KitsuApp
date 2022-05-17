package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.SingleAnimeModel


data class SingleAnimeUI(
    val data: AnimeDataUI
)

fun SingleAnimeModel.toUI() = SingleAnimeUI(data.toUI())
