package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.CategoriesModel


data class CategoriesUI(
    val links: LinksXXUI
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())