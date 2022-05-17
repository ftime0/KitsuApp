package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.MappingsModel


data class MappingsUI(
    val links: LinksXXXXXUI
)

fun MappingsModel.toUI() = MappingsUI(links.toUI())