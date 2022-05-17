package com.example.kitsuapp.presentation.models.manga

import com.example.domain.models.manga.DimensionsXModel

data class DimensionsXUI(
    val tiny: TinyXUI,
    val small: SmallXUI,
    val large: LargeXUI
)

fun DimensionsXModel.toUI() = DimensionsXUI(
    tiny.toUI(),
   small.toUI(),
   large.toUI()
)
