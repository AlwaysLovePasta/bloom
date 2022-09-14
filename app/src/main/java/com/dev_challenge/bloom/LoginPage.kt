package com.dev_challenge.bloom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev_challenge.bloom.ui.theme.*

@Composable
fun LoginPage() {
    Box(Modifier
        .fillMaxSize()
        .background(white)) {
        Column(
            Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LoginTitle()
            Spacer(modifier = Modifier.height(16.dp))
            LoginFields()
            LoginDescription()
            Spacer(modifier = Modifier.height(16.dp))
            LoginButton()
        }
    }
}

@Composable
fun LoginTitle() {
    Box(
        modifier = Modifier.height(184.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Text(
            text = "Login with email",
            style = Typography.h1,
            color = gray,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun LoginFields() {
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
            label = { Text(text = "Email address", style = Typography.body1, color = gray) },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Password (8+ characters)", style = Typography.body1, color = gray) },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        )
    }
}

@Composable
fun LoginDescription() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(48.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Text(
            text = buildAnnotatedString {
                append("By clicking below, you agree to our ")
                withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append("Terms of Use")
                }
                append(" and consent to our ")
                withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append("Privacy Policy")
                }
            },
            style = Typography.body2,
            color = gray,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun LoginButton() {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { /*TODO*/ },
            shape = Shapes.medium,
            colors = ButtonDefaults.buttonColors(backgroundColor = pink900),
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).height(48.dp)
        ) {
            Text(text = "Log in", style = Typography.button, color = white)
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun PreviewLoginPage() {
    LoginPage()
}