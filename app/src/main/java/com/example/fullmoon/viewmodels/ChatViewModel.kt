package com.example.fullmoon.viewmodels


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fullmoon.models.AppDatabase
import com.fullmoon.models.Message
import com.fullmoon.models.MessageEntity
import com.fullmoon.models.ThreadEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ChatViewModel @Inject constructor(private val database: AppDatabase) : ViewModel() {
    private var currentThreadId = 1

    fun getMessages(): List<Message> {
        return database.chatDao().getMessagesForThread(currentThreadId)
            .map { Message(it.id, it.content, it.isUser) }
    }

    fun sendMessage(content: String) {
        viewModelScope.launch {
            val userMessage = MessageEntity(threadId = currentThreadId, content = content, isUser = true)
            database.chatDao().insertMessage(userMessage)

            val botResponse = "Bot Response for: $content" // Replace with real LLM logic
            val botMessage = MessageEntity(threadId = currentThreadId, content = botResponse, isUser = false)
            database.chatDao().insertMessage(botMessage)
        }
    }
}
