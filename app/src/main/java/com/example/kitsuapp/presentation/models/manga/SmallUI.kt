package com.example.kitsuapp.presentation.models.manga

import com.example.domain.models.manga.SmallModel

data class SmallUI(
    val width: Int?,
    val height: Int?
)

fun SmallModel.toUI() = SmallUI(width, height)
