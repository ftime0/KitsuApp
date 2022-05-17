package com.example.kitsuapp.presentation.extention

import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.kitsuapp.R

fun Fragment.mainNavController() = requireActivity().findNavController(R.id.nav_host_fragment)