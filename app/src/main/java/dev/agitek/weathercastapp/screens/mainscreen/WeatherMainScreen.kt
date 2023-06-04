package dev.agitek.weathercastapp.screens.mainscreen

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun WeatherMainScreen(navController: NavHostController) {
    Text("Main Screen", style = MaterialTheme.typography.headlineLarge)
}
