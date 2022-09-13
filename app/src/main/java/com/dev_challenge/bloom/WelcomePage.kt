package com.dev_challenge.bloom

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
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
fun WelcomePage() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(pink100)
    ) {
        Image(
            painter = rememberVectorPainter(
                image = ImageVector.vectorResource(id = R.drawable.ic_light_welcome_bg)
            ),
            contentDescription = "welcome_bg"
        )
        WelcomeContent()
    }
}

@Composable
fun WelcomeContent() {
    Column(Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(72.dp))
        LeafImage()
        Spacer(modifier = Modifier.height(48.dp))
        WelcomeTitle()
        Spacer(modifier = Modifier.height(40.dp))
        WelcomeButtons()
    }
}

@Composable
fun LeafImage() {
    Image(
        painter = rememberVectorPainter(
            image = ImageVector.vectorResource(id = R.drawable.ic_light_welcome_illos)
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
                image = ImageVector.vectorResource(id = R.drawable.ic_light_logo)
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
                style = Typography.subtitle1,
                color = gray,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun WelcomeButtons() {
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
                .clip(Shapes.medium),
            colors = ButtonDefaults.buttonColors(backgroundColor = pink900)
        ) {
            Text(text = "Create account", style = Typography.button, color = white)
        }
        Spacer(modifier = Modifier.height(24.dp))
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Log in", style = Typography.button, color = pink900)
        }
    }

}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun PreviewPage() {
    WelcomePage()
}