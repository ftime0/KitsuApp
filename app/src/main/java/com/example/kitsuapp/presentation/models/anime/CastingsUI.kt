package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.CastingsModel


data class CastingsUI(
    val links: LinksXXXUI
)

fun CastingsModel.toUI() = CastingsUI(links.toUI())
