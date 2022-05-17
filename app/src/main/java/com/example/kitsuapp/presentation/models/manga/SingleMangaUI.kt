package com.example.kitsuapp.presentation.models.manga

import com.example.domain.models.manga.SingleMangaModel

data class SingleMangaUI(
    val data: MangaDataUI
)

fun SingleMangaModel.toUI() = SingleMangaUI(data.toUI())
