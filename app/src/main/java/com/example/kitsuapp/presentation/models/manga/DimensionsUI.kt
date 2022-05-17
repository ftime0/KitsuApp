package com.example.kitsuapp.presentation.models.manga

import com.example.domain.models.manga.DimensionsModel

data class DimensionsUI(
    val tiny: TinyUI,
    val small: SmallUI,
    val medium: MediumUI,
    val large: LargeUI
)

fun DimensionsModel.toUI() = DimensionsUI(
    tiny.toUI(),
    small.toUI(),
  medium.toUI(),
large.toUI()
)