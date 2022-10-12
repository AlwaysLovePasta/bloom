package com.dev_challenge.bloom.ui.page.composables.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.dev_challenge.bloom.R
import com.dev_challenge.bloom.ui.theme.Shapes

data class CardItem(val name: String, val image: Painter)

@Composable
fun CardList() {
    val cardItems = listOf(
        CardItem("Desert chic", painterResource(id = R.drawable.desert_chic)),
        CardItem("Tiny terrariums", painterResource(id = R.drawable.tiny_terrariums)),
        CardItem("Jungle vibes", painterResource(id = R.drawable.jungle_vibes)),
        CardItem("Easy care", painterResource(id = R.drawable.easy_care)),
        CardItem("Statements", painterResource(id = R.drawable.statements))
    )
    LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        items(
            items = cardItems,
            key = { it.name }
        ) { cardItem ->
            Card(Modifier.size(136.dp), elevation = 1.dp, shape = Shapes.small) {
                Column {
                    Image(
                        painter = cardItem.image,
                        contentDescription = cardItem.name,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.height(96.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = cardItem.name,
                        style = MaterialTheme.typography.h2,
                        color = MaterialTheme.colors.onBackground,
                        modifier = Modifier.padding(start = 16.dp),
                    )
                }
            }
        }
    }
}