package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.AnimeStaffModel


data class AnimeStaffUI(
    val links: LinksXXXXXXXXXXXXUI
)

fun AnimeStaffModel.toUI() = AnimeStaffUI(links.toUI())
