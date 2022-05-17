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
    private val onItemClick: (id: String, videoId: String?) -> Unit,
) : PagingDataAdapter<AnimeDataUI, AnimeAdapter.AnimeViewHolder>(BaseDiffUtils()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            ItemAnimeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    inner class AnimeViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(animeDataDto: AnimeDataUI) {
            binding.imImage.setImage(animeDataDto.animeDto.posterImage?.original)

            binding.root.setOnClickListener {
                if (animeDataDto.animeDto.youtubeVideoId != null)
                    onItemClick(animeDataDto.id, animeDataDto.animeDto.youtubeVideoId)
                else onItemClick(animeDataDto.id, null)

            }
        }
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

}

