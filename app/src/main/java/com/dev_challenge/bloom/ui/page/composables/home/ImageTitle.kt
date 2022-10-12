package com.dev_challenge.bloom.ui.page.composables.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.dev_challenge.bloom.R

@Composable
fun ImageTitle() {
    Row(
        Modifier
            .fillMaxWidth()
            .height(40.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom

    ) {
        Text(
            text = "Design your home garden",
            style = MaterialTheme.typography.h1,
            color = MaterialTheme.colors.onBackground
        )
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_filter_list),
            contentDescription = "filter",
            modifier = Modifier
                .size(24.dp)
                .weight(1f, false)
        )
    }
}