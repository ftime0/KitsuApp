package com.example.kitsuapp.presentation.ui.fragments.authentication

import com.example.domain.usecases.SignInUseCase
import com.example.kitsuapp.presentation.base.BaseViewModel
import com.example.kitsuapp.presentation.models.authentication.TokenUI
import com.example.kitsuapp.presentation.models.authentication.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val signInUseCase: SignInUseCase
) : BaseViewModel() {
    private val _signInState = mutableUIStateFlow<TokenUI>()
    val signInState = _signInState.asStateFlow()

    fun signIn(username: String, password: String) =
        signInUseCase(username, password).collectRequest(_signInState) { it.toUI() }
}