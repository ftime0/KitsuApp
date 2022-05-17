package com.example.domain.usecases

import com.example.domain.repositories.AnimeRepository
import javax.inject.Inject

class FetchAnimeUseCase@Inject constructor(private val repository: AnimeRepository) {

    operator fun invoke(id:String) = repository.fetchAnime(id )
}