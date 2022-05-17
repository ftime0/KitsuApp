package com.example.kitsuapp.presentation.base

import androidx.recyclerview.widget.DiffUtil

class BaseDiffUtils<T : BaseDiffModel> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: T, newItem: T) =
        oldItem == newItem
}