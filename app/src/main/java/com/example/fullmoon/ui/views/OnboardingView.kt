
package com.fullmoon.ui.views

import androidx.compose.runtime.Composable
import androidx.compose.material.Button
import androidx.compose.material.Text

@Composable
fun OnboardingView(onComplete: () -> Unit) {
    Button(onClick = onComplete) {
        Text("Get Started")
    }
}
