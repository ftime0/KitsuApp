package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.LargeModel


data class LargeUI(
    val width: Int?,
    val height: Int?
)

fun LargeModel.toUI() = LargeUI(width, height)
