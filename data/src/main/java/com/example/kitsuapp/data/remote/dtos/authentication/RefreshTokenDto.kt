package com.example.kitsuapp.data.remote.dtos.authentication


import com.google.gson.annotations.SerializedName

data class RefreshTokenDto(
    @SerializedName("grant_type")
    val grantType: String,
    @SerializedName("refresh_token")
    val refreshToken: String
)