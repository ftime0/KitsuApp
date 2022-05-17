package com.example.kitsuapp.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.domain.models.anime.RelationshipsModel

data class Relationships(
    @SerializedName("genres")
    val genres: Genres?,
    @SerializedName("categories")
    val categories: Categories?,
    @SerializedName("castings")
    val castings: Castings?,
    @SerializedName("installments")
    val installments: Installments?,
    @SerializedName("mappings")
    val mappings: Mappings?,
    @SerializedName("reviews")
    val reviews: Reviews?,
    @SerializedName("mediaRelationships")
    val mediaRelationships: MediaRelationships?,
    @SerializedName("episodes")
    val episodes: Episodes?,
    @SerializedName("streamingLinks")
    val streamingLinks: StreamingLinks?,
    @SerializedName("animeProductions")
    val animeProductions: AnimeProductions?,
    @SerializedName("animeCharacters")
    val animeCharactersDto: AnimeCharactersDto?,
    @SerializedName("animeStaff")
    val animeStaff: AnimeStaff?
)

fun Relationships.toDomain() = RelationshipsModel(
    genres?.toDomain(),
    categories?.toDomain(),
    castings?.toDomain(),
    installments?.toDomain(),
    mappings?.toDomain(),
    reviews?.toDomain(),
    mediaRelationships?.toDomain(),
    episodes?.toDomain(),
    streamingLinks?.toDomain(),
    animeProductions?.toDomain(),
    animeCharactersDto?.toDomain(),
    animeStaff?.toDomain()
)