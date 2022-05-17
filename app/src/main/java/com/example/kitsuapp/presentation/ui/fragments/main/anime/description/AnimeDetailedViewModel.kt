package com.example.kitsuapp.presentation.ui.fragments.main.anime.description

import com.example.domain.usecases.FetchAnimeUseCase
import com.example.kitsuapp.presentation.base.BaseViewModel
import com.example.kitsuapp.presentation.models.anime.SingleAnimeUI
import com.example.kitsuapp.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


@HiltViewModel
class AnimeDetailedViewModel @Inject constructor(
    private val fetchAnimeUseCase: FetchAnimeUseCase
) : BaseViewModel() {
    private val _animeDetailedState = mutableUIStateFlow<SingleAnimeUI>()
    var animeDetailedState = _animeDetailedState.asStateFlow()

    fun fetchADetailedAnime(id: String) =
        fetchAnimeUseCase(id).collectRequest(_animeDetailedState) { it.toUI() }
}