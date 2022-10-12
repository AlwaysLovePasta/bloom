package com.dev_challenge.bloom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dev_challenge.bloom.ui.page.HomePage
import com.dev_challenge.bloom.ui.page.LoginPage
import com.dev_challenge.bloom.ui.page.WelcomePage
import com.dev_challenge.bloom.ui.theme.BloomTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val systemUiController = rememberSystemUiController()
            systemUiController.setSystemBarsColor(color = MaterialTheme.colors.background)
            BloomTheme { BloomApp() }
        }
    }
}

@Composable
fun BloomApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = Router.WelcomePage.route
        ) {
            composable(Router.WelcomePage.route) { WelcomePage(navController) }
            composable(Router.LoginPage.route) { LoginPage(navController) }
            composable(Router.HomePage.route) { HomePage() }
        }
    }
}