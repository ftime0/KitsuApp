package com.example.kitsuapp.data.remote.apisevise

import com.example.kitsuapp.data.remote.dtos.authentication.AuthDto
import com.example.kitsuapp.data.remote.dtos.authentication.TokenDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationApi {
    @POST("token")
    suspend fun authenticate(
        @Body authDto: AuthDto
    ): TokenDto

}