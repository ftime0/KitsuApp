package com.example.kitsuapp.presentation.ui.fragments.main.anime

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapp.R
import com.example.kitsuapp.databinding.FragmentAnimeBinding
import com.example.kitsuapp.presentation.base.BaseFragment
import com.example.kitsuapp.presentation.extention.directionsSafeNavigation
import com.example.kitsuapp.presentation.ui.adapters.anime.AnimeAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeFragment : BaseFragment<FragmentAnimeBinding, AnimeViewModel>(R.layout.fragment_anime) {
    override val binding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel: AnimeViewModel by viewModels()
    private val animeAdapter = AnimeAdapter(this::onClick)
    override fun setupViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerview.adapter = animeAdapter

    }

    override fun setupSubscribes() {
        viewModel.fetchAnime().viewingPaging(
            error = {
                Log.e("ERROR", it)
            },
            success = {
                animeAdapter.submitData(it)
            })    }


    private fun onClick(id: String, video: String?) {
        findNavController().directionsSafeNavigation(
            AnimeFragmentDirections.actionAnimeFragmentToAnimeDescriptionFragment(
                id, video
            )
        )
    }
}