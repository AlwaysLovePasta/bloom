package com.dev_challenge.bloom.ui.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dev_challenge.bloom.ui.page.composables.login.*

@Composable
fun LoginPage(navController: NavController) {
    Box(Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)) {
        Column(
            Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Title()
            Spacer(modifier = Modifier.height(16.dp))
            Fields()
            Description()
            Spacer(modifier = Modifier.height(16.dp))
            LoginButton(navController = navController)
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun PreviewLoginPage() {
    LoginPage(rememberNavController())
}