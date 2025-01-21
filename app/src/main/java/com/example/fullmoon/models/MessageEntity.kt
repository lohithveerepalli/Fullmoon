package com.example.fullmoon.models


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "messages")
data class MessageEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val threadId: Int,
    val content: String,
    val isUser: Boolean
)
