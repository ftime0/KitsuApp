package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.TinyModel


data class TinyUI(
    val width: Int?,
    val height: Int?
)

fun TinyModel.toUI() = TinyUI(
    width, height
)