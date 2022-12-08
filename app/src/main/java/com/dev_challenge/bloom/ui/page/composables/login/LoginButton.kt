package com.dev_challenge.bloom.ui.page.composables.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dev_challenge.bloom.Router
import com.dev_challenge.bloom.RouterController
import com.dev_challenge.bloom.ui.theme.Typography

@Composable
fun LoginButton(navController: NavController? = RouterController) {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { navController?.apply { navigate(Router.HomePage.routeName) } },
            shape = MaterialTheme.shapes.medium,
            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondary),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(48.dp)
        ) {
            Text(text = "Log in", style = Typography.button, color = MaterialTheme.colors.onSecondary)
        }
    }
}