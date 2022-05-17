package com.example.kitsuapp.presentation.ui.fragments.authentication

import android.widget.Toast
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapp.R
import com.example.kitsuapp.databinding.FragmentSignInBinding
import com.example.kitsuapp.presentation.base.BaseFragment
import com.example.kitsuapp.presentation.extention.mainNavController
import com.example.kitsuapp.presentation.extention.safeNavigation
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SignInFragment :
    BaseFragment<FragmentSignInBinding, SignInViewModel>(R.layout.fragment_sign_in) {
    override val binding by viewBinding(FragmentSignInBinding::bind)
    override val viewModel: SignInViewModel by viewModels()

    override fun setupSubscribes() {
        subscribeToAuthorization()
    }

    private fun subscribeToAuthorization() {
        viewModel.signInState.collectUiState(error = {
            Toast.makeText(
                requireActivity(),
                "ERROR! Try Again",
                Toast.LENGTH_SHORT
            ).show()
        },
            success = {
                mainNavController().safeNavigation(R.id.action_signInFlowFragment_to_mainFlowFragment)

            }, gatherIfSucceed = {
                it.setupViewVisibility(binding.constraint, binding.progressbar)
            })
    }

    override fun setupListeners() {
        binding.btnSignIn.setOnClickListener {
            viewModel.signIn(binding.etEmail.text.toString(), binding.etPassword.text.toString())
        }
    }
}