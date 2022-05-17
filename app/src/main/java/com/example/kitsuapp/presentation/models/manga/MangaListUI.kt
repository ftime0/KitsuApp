package com.example.kitsuapp.presentation.models.manga

import com.example.domain.models.manga.MangaListModel

data class MangaListUI(
    val data: List<MangaDataUI>,
    val meta: MetaXXUI,
    val links: LinksXXXXXXXXXXXUI
)

fun MangaListModel.toUI() = MangaListUI(data.map { it.toUI() },
    meta.toUI(),
    links.toUI()
)
