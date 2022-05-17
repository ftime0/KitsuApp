package com.example.kitsuapp.presentation.ui.fragments.main.manga.description

import com.example.domain.usecases.FetchMangaUseCase
import com.example.kitsuapp.presentation.base.BaseViewModel
import com.example.kitsuapp.presentation.models.manga.SingleMangaUI
import com.example.kitsuapp.presentation.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


@HiltViewModel
class MangaDescriptionViewModel @Inject constructor(
    private val fetchMangaUseCase: FetchMangaUseCase,
) : BaseViewModel() {
    private val _mangaDetailedState = mutableUIStateFlow<SingleMangaUI>()
    var mangaDetailedState = _mangaDetailedState.asStateFlow()

    fun fetchDetailedManga(id: String) =
        fetchMangaUseCase(id).collectRequest(_mangaDetailedState) { it.toUI() }
}
