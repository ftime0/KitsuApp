package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.AnimeListModel


data class AnimeListUI(
    val data: List<AnimeDataUI>,
    val meta: MetaXXUI? = null,
    val links: LinksXXXXXXXXXXXXXUI? = null
)

fun AnimeListModel.toUI() = AnimeListUI(data.map { it.toUI() }, meta?.toUI(), links?.toUI())
