package com.example.kitsuapp.presentation.models.manga

import com.example.domain.models.manga.LargeModel

data class LargeUI(
    val width: Int?,
    val height: Int?
)

fun LargeModel.toUI() = LargeUI(width, height)
