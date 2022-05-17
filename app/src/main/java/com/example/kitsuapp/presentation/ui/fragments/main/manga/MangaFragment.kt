package com.example.kitsuapp.presentation.ui.fragments.main.manga

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapp.R
import com.example.kitsuapp.databinding.FragmentMangaBinding
import com.example.kitsuapp.presentation.base.BaseFragment
import com.example.kitsuapp.presentation.extention.directionsSafeNavigation
import com.example.kitsuapp.presentation.ui.adapters.manga.MangaAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MangaFragment : BaseFragment<FragmentMangaBinding, MangaViewModel>(R.layout.fragment_manga) {
    override val binding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel: MangaViewModel by viewModels()
    private val mangaAdapter = MangaAdapter(this::onClick)

    override fun setupViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerview.adapter = mangaAdapter
    }

    override fun setupSubscribes() {
        viewModel.fetchManga().viewingPaging(
            error = {
                Log.e("ERROR", it)
            },
            success = {
                mangaAdapter.submitData(it)
            }
        )
    }

    private fun onClick(id: String) {
        findNavController().directionsSafeNavigation(
            MangaFragmentDirections.actionMangaFragmentToMangaDescriptionFragment(
                id
            )
        )
    }

}
