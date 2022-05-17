package com.example.domain.repositories

import com.example.domain.either.Either
import com.example.domain.models.authentication.TokenModel
import kotlinx.coroutines.flow.Flow

interface AuthenticationRepository {
    fun authenticate(username: String, password: String): Flow<Either<String, TokenModel>>
}