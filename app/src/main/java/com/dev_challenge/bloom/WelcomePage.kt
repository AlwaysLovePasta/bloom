package com.dev_challenge.bloom

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev_challenge.bloom.ui.theme.*

@Composable
fun WelcomePage(onNavigate: () -> Unit) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.primary)) {
        Image(
            painter = rememberVectorPainter(
                image = ImageVector.vectorResource(id = MaterialTheme.assets.background)
            ),
            contentDescription = "welcome_bg"
        )
        WelcomeContent(onNavigate)
    }
}

@Composable
fun WelcomeContent(onNavigate: () -> Unit) {
    Column(Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(72.dp))
        LeafImage()
        Spacer(modifier = Modifier.height(48.dp))
        WelcomeTitle()
        Spacer(modifier = Modifier.height(40.dp))
        WelcomeButtons(onNavigate)
    }
}

@Composable
fun LeafImage() {
    Image(
        painter = rememberVectorPainter(
            image = ImageVector.vectorResource(id = MaterialTheme.assets.illos)
        ),
        contentDescription = "welcome_illos",
        modifier = Modifier
            .wrapContentSize()
            .padding(start = 88.dp)
    )
}

@Composable
fun WelcomeTitle() {
    Column(
        Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = rememberVectorPainter(
                image = ImageVector.vectorResource(id = MaterialTheme.assets.logo)
            ),
            contentDescription = "welcome_logo",
            Modifier.wrapContentSize()
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(32.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(
                text = "Beautiful home garden solutions",
                style = MaterialTheme.typography.subtitle1,
                color = MaterialTheme.colors.onPrimary,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun WelcomeButtons(onNavigate: () -> Unit) {
    Column(
        Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { /*TODO*/ },
            Modifier
                .height(48.dp)
                .padding(horizontal = 16.dp)
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.medium),
            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondary)
        ) {
            Text(
                text = "Create account",
                style = MaterialTheme.typography.button,
                color = MaterialTheme.colors.onSecondary
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
        TextButton(onClick = onNavigate) {
            Text(
                text = "Log in",
                style = MaterialTheme.typography.button,
                color = MaterialTheme.colors.onPrimary
            )
        }
    }

}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun PreviewPage() {
    WelcomePage{}
}