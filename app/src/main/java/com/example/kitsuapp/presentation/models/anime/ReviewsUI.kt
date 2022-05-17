package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.ReviewsModel


data class ReviewsUI(
    val links: LinksXXXXXXUI
)

fun ReviewsModel.toUI() = ReviewsUI(links.toUI())
