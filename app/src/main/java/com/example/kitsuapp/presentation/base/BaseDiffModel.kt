package com.example.kitsuapp.presentation.base

interface BaseDiffModel {
    val id: String
    override fun equals(other: Any?): Boolean
}