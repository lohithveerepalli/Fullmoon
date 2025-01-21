package com.example.fullmoon.models

data class Thread(
    val id: Int,
    val name: String,
    val messages: List<Message>
)
