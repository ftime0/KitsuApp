package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.LargeXModel


data class LargeXUI(
    val width: Int?,
    val height: Int?
)

fun LargeXModel.toUI() = LargeXUI(width, height)
