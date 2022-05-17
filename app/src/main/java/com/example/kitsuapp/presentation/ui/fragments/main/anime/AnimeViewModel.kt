package com.example.kitsuapp.presentation.ui.fragments.main.anime

import com.example.kitsuapp.data.repositories.AnimeRepositoryImpl
import com.example.kitsuapp.presentation.base.BaseViewModel
import com.example.kitsuapp.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val animeRepositoryImpl: AnimeRepositoryImpl
) : BaseViewModel() {

    fun fetchAnime() =
        animeRepositoryImpl.fetchPageAnime().collectPagingRequest {
            it.toUI()
        }
}