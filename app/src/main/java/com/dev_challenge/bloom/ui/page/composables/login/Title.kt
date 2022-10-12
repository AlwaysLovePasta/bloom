package com.dev_challenge.bloom.ui.page.composables.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun Title() {
    Box(
        modifier = Modifier.height(184.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Text(
            text = "Login with email",
            style = MaterialTheme.typography.h1,
            color = MaterialTheme.colors.onBackground,
            textAlign = TextAlign.Center
        )
    }
}