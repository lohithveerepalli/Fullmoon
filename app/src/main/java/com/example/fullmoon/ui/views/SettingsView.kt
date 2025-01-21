package com.example.fullmoon.ui.views


import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsView(onBack: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Settings") }, navigationIcon = {
                IconButton(onClick = { onBack() }) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                }
            })
        },
        content = {
            Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
                Text(text = "Settings Page")
                // Additional settings can be added here
            }
        }
    )
}
