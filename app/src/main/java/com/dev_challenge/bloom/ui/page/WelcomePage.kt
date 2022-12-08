package com.dev_challenge.bloom.ui.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.dev_challenge.bloom.ui.page.composables.welcome.Content
import com.dev_challenge.bloom.ui.theme.*

@Composable
fun WelcomePage() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.primary)) {
        Image(
            painter = rememberVectorPainter(
                image = ImageVector.vectorResource(id = MaterialTheme.assets.background)
            ),
            contentDescription = "welcome_bg"
        )
        Content()
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun PreviewPage() {
    WelcomePage()
}