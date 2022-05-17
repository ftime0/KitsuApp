package com.example.kitsuapp.presentation.models.anime

import com.example.domain.models.anime.AnimeDataModel
import com.example.kitsuapp.presentation.base.BaseDiffModel

data class AnimeDataUI(
    override val id: String,
    val type: String?,
    val links: LinksUI?,
    val animeDto: AnimeUI,
    val relationships: RelationshipsUI?
) : BaseDiffModel

fun AnimeDataModel.toUI() =
    AnimeDataUI(id, type, links?.toUI(), animeDto.toUI(), relationships?.toUI())
