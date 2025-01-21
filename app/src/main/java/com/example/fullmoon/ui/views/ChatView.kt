package com.example.fullmoon.ui.views


import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.fullmoon.models.Message
import com.fullmoon.viewmodels.ChatViewModel

@Composable
fun ChatView(
    chatViewModel: ChatViewModel = viewModel(),
    onSettingsClick: () -> Unit
) {
    val messages by remember { mutableStateOf(chatViewModel.getMessages()) }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Chat") }, actions = {
                IconButton(onClick = { onSettingsClick() }) {
                    Icon(Icons.Default.Settings, contentDescription = "Settings")
                }
            })
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                messages.forEach { message ->
                    Text(
                        text = if (message.isUser) "You: ${message.content}" else "Bot: ${message.content}",
                        modifier = Modifier.padding(8.dp)
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Row(modifier = Modifier.fillMaxWidth()) {
                    var input by remember { mutableStateOf("") }
                    BasicTextField(
                        value = input,
                        onValueChange = { input = it },
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)
                    )
                    Button(onClick = {
                        if (input.isNotEmpty()) {
                            chatViewModel.sendMessage(input)
                            input = ""
                        }
                    }) {
                        Text("Send")
                    }
                }
            }
        }
    )
}
