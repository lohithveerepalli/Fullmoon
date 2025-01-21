package com.example.fullmoon.ui.views



import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ContentView() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "onboarding") {
        composable("onboarding") { OnboardingView { navController.navigate("chat") } }
        composable("chat") { ChatView { navController.navigate("settings") } }
        composable("settings") { SettingsView { navController.navigateUp() } }
    }
}
