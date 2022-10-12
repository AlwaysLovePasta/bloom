package com.dev_challenge.bloom.ui.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev_challenge.bloom.ui.page.composables.home.*

@Composable
fun HomePage() {
    Scaffold(bottomBar = { BottomBar() }) {
        Column(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background)
                .padding(horizontal = 16.dp)
                .padding(bottom = it.calculateBottomPadding()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(40.dp))
            SearchBar()
            CardTitle()
            Spacer(modifier = Modifier.height(16.dp))
            CardList()
            ImageTitle()
            Spacer(modifier = Modifier.height(16.dp))
            ImageList()
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun PreviewHomePage() {
    HomePage()
}