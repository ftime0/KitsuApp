package com.example.kitsuapp.presentation.models.manga

import com.example.domain.models.manga.TinyModel

data class TinyUI(
    val width: Int?,
    val height: Int?
)

fun TinyModel.toUI() = TinyUI(width, height)
