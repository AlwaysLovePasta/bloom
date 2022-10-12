package com.dev_challenge.bloom.ui.page.composables.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Fields() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(
                text = "Email address",
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground
            ) },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(
                text = "Password (8+ characters)",
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground
            ) },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        )
    }
}