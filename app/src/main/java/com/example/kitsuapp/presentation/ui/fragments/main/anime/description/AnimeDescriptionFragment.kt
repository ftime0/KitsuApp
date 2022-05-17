package com.example.kitsuapp.presentation.ui.fragments.main.anime.description

import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapp.R
import com.example.kitsuapp.databinding.FragmentAnimeDescriptionBinding
import com.example.kitsuapp.presentation.base.BaseFragment
import com.example.kitsuapp.presentation.extention.setImage
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeDescriptionFragment :
    BaseFragment<FragmentAnimeDescriptionBinding, AnimeDetailedViewModel>(R.layout.fragment_anime_description) {
    override val binding by viewBinding(FragmentAnimeDescriptionBinding::bind)
    override val viewModel: AnimeDetailedViewModel by viewModels()
    private val args: AnimeDescriptionFragmentArgs by navArgs()

    override fun setupRequest() {
        viewModel.fetchADetailedAnime(args.anime)
    }

    override fun setupSubscribes() {
        subscribesAnime()
    }
    override fun setupListeners() {
        openYoutubeAnime()
    }


    private fun subscribesAnime() {
        viewModel.animeDetailedState.collectUiState(success = {
            binding.apply {

                it.apply {
                    imCover.setImage(data.animeDto.coverImage?.original)
                    imPoster.setImage(data.animeDto.posterImage?.medium)
                    tvSubtype.text = data.animeDto.subtype?.uppercase()
                    tvYear.text = data.animeDto.createdAt
                    tvTitle.text = data.animeDto.titles?.en
                    tvSynopsis.text = data.animeDto.synopsis
                    tvAverageRating.text = "${data.animeDto.averageRating}%"
                    tvRating.text = "Rank #${data.animeDto.ratingRank}"
                    tvPopularity.text = "Rank #${data.animeDto.popularityRank}"
                }
            }
        }, error = { Log.e("ERROR", it) })
    }

    private fun openYoutubeAnime() {
        binding.btnTrailer.setOnClickListener {
            this.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("vnd.youtube:${args.video}")
                )
            )
        }
    }

}