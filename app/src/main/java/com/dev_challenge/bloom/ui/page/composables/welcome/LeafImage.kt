package com.dev_challenge.bloom.ui.page.composables.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.dev_challenge.bloom.ui.theme.assets

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