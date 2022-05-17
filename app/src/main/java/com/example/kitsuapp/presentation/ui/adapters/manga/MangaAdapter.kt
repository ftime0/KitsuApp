package com.example.kitsuapp.presentation.ui.adapters.manga

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsuapp.databinding.ItemMangaBinding
import com.example.kitsuapp.presentation.base.BaseDiffUtils
import com.example.kitsuapp.presentation.extention.setImage
import com.example.kitsuapp.presentation.models.manga.MangaDataUI

class MangaAdapter(
    private val onClick: (id: String) -> Unit
) :
    PagingDataAdapter<MangaDataUI, MangaAdapter.MangaViewHolder>(BaseDiffUtils()) {


    inner class MangaViewHolder(private val binding: ItemMangaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(mangaData: MangaDataUI) {
            binding.imImage.setImage(mangaData.mangaDto.posterImage.original)
            binding.root.setOnClickListener {
                onClick(mangaData.id)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaViewHolder {
        return MangaViewHolder(
            (ItemMangaBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ))
        )
    }

    override fun onBindViewHolder(holder: MangaViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

}