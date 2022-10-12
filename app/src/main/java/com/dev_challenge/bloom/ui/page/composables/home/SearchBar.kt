package com.dev_challenge.bloom.ui.page.composables.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar() {
    var searchText by remember { mutableStateOf("") }
    Box(modifier = Modifier.fillMaxWidth()) {
        OutlinedTextField(
            value = searchText,
            onValueChange = { searchText = it },
            label = { Text(
                text = "Search",
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground
            ) },
            leadingIcon = { Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "search_icon",
                modifier = Modifier.size(18.dp)
            ) },
            modifier = Modifier
                .height(56.dp)
                .fillMaxWidth()
        )
    }
}