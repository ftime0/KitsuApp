package com.example.kitsuapp.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.domain.models.anime.AnimeModel


data class AnimeDto(
    @SerializedName("createdAt")
    val createdAt: String?,
    @SerializedName("updatedAt")
    val updatedAt: String?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("synopsis")
    val synopsis: String?,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int,
    @SerializedName("titles")
    val titles: Titles?,
    @SerializedName("canonicalTitle")
    val canonicalTitle: String?,
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: List<String>?,
    @SerializedName("averageRating")
    val averageRating: String?,
    @SerializedName("ratingFrequencies")
    val ratingFrequencies: RatingFrequencies?,
    @SerializedName("userCount")
    val userCount: Int,
    @SerializedName("favoritesCount")
    val favoritesCount: Int,
    @SerializedName("startDate")
    val startDate: String?,
    @SerializedName("endDate")
    val endDate: String?,
    @SerializedName("nextRelease")
    val nextRelease: Any?,
    @SerializedName("popularityRank")
    val popularityRank: Int?,
    @SerializedName("ratingRank")
    val ratingRank: Int?,
    @SerializedName("ageRating")
    val ageRating: String?,
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String?,
    @SerializedName("subtype")
    val subtype: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("tba")
    val tba: String?,
    @SerializedName("posterImage")
    val posterImage: PosterImage?,
    @SerializedName("coverImage")
    val coverImage: CoverImage?,
    @SerializedName("episodeCount")
    val episodeCount: Int?,
    @SerializedName("episodeLength")
    val episodeLength: Int?,
    @SerializedName("youtubeVideoId")
    val youtubeVideoId: String?,
    @SerializedName("showType")
    val showType: String?,
    @SerializedName("nsfw")
    val nsfw: Boolean?
)

fun AnimeDto.toDomain() = AnimeModel(
    createdAt,
    updatedAt,
    slug,
    synopsis,
    coverImageTopOffset,
    titles?.toDomain(),
    canonicalTitle,
    abbreviatedTitles,
    averageRating,
    ratingFrequencies?.toDomain(),
    userCount,
    favoritesCount,
    startDate,
    endDate,
    nextRelease,
    popularityRank,
    ratingRank,
    ageRating,
    ageRatingGuide,
    subtype,
    status,
    tba,
    posterImage?.toDomain(),
    coverImage?.toDomain(),
    episodeCount,
    episodeLength,
    youtubeVideoId,
    showType,
    nsfw

)