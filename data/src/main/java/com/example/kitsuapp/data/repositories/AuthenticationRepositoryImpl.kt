package com.example.kitsuapp.data.repositories

import com.example.kitsuapp.data.remote.dtos.authentication.AuthDto
import com.example.kitsuapp.data.remote.dtos.authentication.toDomain
import com.example.domain.models.authentication.TokenModel
import com.example.domain.repositories.AuthenticationRepository
import com.example.kitsuapp.data.base.BaseRepository
import com.example.kitsuapp.data.local.preferences.PreferencesHelper
import com.example.kitsuapp.data.remote.apisevise.AuthenticationApi
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(

    private val api: AuthenticationApi,
    private val preferencesHelper: PreferencesHelper
) : BaseRepository(), AuthenticationRepository {
    override fun authenticate(
        username: String,
        password: String
    ) = doRequest(this::saveToken) {
        api.authenticate(AuthDto(username = username, password = password))
            .toDomain()
    }

    private fun saveToken(tokenModel: TokenModel) {
        preferencesHelper.accessToken = tokenModel.accessToken
        preferencesHelper.refreshToken = tokenModel.refreshToken
        preferencesHelper.isAuthenticated = true
    }
}