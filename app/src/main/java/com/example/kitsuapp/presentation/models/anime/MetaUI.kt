package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.MetaModel


data class MetaUI(
    val dimensions: DimensionsUI
)

fun MetaModel.toUI() = MetaUI(
    dimensionsModel.toUI()
)