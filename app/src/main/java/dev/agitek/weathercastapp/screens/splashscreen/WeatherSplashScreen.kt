package dev.agitek.weathercastapp.screens.splashscreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.agitek.weathercastapp.R

@Composable
fun WeatherSplashScreen(navController: NavController) {
    Surface(modifier = Modifier
        .padding(15.dp)
        .size(330.dp)
        .background(Color.Transparent),
        shape = CircleShape,
        border = BorderStroke(width = 3.dp, color = Color.LightGray)
    ) {
        Column(modifier = Modifier.padding(1.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.cloud),
                contentDescription = "Cloud icon", modifier = Modifier.size(55.dp))
            Text("WeatherCast", style = MaterialTheme.typography.titleMedium)
        }
    }

}