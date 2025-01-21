package com.example.fullmoon.models


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface ChatDao {
    @Query("SELECT * FROM threads")
    fun getAllThreads(): List<ThreadEntity>

    @Transaction
    @Query("SELECT * FROM messages WHERE threadId = :threadId")
    fun getMessagesForThread(threadId: Int): List<MessageEntity>

    @Insert
    fun insertMessage(message: MessageEntity)

    @Insert
    fun insertThread(thread: ThreadEntity)
}
