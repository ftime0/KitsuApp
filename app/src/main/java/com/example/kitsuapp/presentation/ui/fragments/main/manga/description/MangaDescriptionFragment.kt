package com.example.kitsuapp.presentation.ui.fragments.main.manga.description

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapp.R
import com.example.kitsuapp.databinding.FragmentMangaDescriptionBinding
import com.example.kitsuapp.presentation.base.BaseFragment
import com.example.kitsuapp.presentation.extention.setImage
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MangaDescriptionFragment :
    BaseFragment<FragmentMangaDescriptionBinding, MangaDescriptionViewModel>(R.layout.fragment_manga_description) {
    override val binding by viewBinding(FragmentMangaDescriptionBinding::bind)
    override val viewModel: MangaDescriptionViewModel by viewModels()
    private val args: MangaDescriptionFragmentArgs by navArgs()

    override fun setupRequest() {
        viewModel.fetchDetailedManga(args.manga)
    }

    override fun setupSubscribes() {
        subscribesManga()
    }

    private fun subscribesManga() {
        viewModel.mangaDetailedState.collectUiState(
            success = {
                binding.apply {
                    it.apply {
                        imCover.setImage(data.mangaDto.coverImage?.original)
                        imPoster.setImage(data.mangaDto.posterImage.medium)
                        tvSubtype.text = data.mangaDto.subtype.uppercase()
                        tvYear.text = data.mangaDto.createdAt
                        tvTitle.text = data.mangaDto.titles.en
                        tvSynopsis.text = data.mangaDto.synopsis
                        tvAverageRating.text = "${data.mangaDto.averageRating}%"
                        tvRating.text = "Rank #${data.mangaDto.ratingRank}"
                        tvPopularity.text = "Rank #${data.mangaDto.popularityRank}"

                    }
                }
            }, error = { Log.e("ERROR", it) }
        )

    }

}