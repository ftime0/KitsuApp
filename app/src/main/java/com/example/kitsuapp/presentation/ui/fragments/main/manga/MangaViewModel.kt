package com.example.kitsuapp.presentation.ui.fragments.main.manga

import com.example.kitsuapp.data.repositories.MangaRepositoryImpl
import com.example.kitsuapp.presentation.base.BaseViewModel
import com.example.kitsuapp.presentation.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class MangaViewModel @Inject constructor(
    private val mangaRepositoryImpl: MangaRepositoryImpl

) : BaseViewModel() {
    fun fetchManga() = mangaRepositoryImpl.fetchPageManga().collectPagingRequest { it.toUI() }
}