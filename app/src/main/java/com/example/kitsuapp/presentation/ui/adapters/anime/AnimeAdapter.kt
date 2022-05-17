package com.example.kitsuapp.presentation.ui.adapters.anime

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsuapp.databinding.ItemAnimeBinding
import com.example.kitsuapp.presentation.base.BaseDiffUtils
import com.example.kitsuapp.presentation.extention.setImage
import com.example.kitsuapp.presentation.models.anime.AnimeDataUI

class AnimeAdapter(
    private val onClick: (id: String, videoId: String?) -> Unit
) : PagingDataAdapter<AnimeDataUI, AnimeAdapter.AnimeViewHolder>(BaseDiffUtils()) {

    inner class AnimeViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(animeDataDto: AnimeDataUI) {
            binding.imImage.setImage(animeDataDto.animeDto.posterImage?.original)
            binding.root.setOnClickListener {
                onClick(animeDataDto.id, animeDataDto.animeDto.youtubeVideoId)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            (ItemAnimeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ))
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }
}

