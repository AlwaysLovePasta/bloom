package com.dev_challenge.bloom.ui.page.composables.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.dev_challenge.bloom.ui.state_holder.BloomViewModel
import com.dev_challenge.bloom.ui.state_holder.ImageItem
import com.dev_challenge.bloom.ui.theme.Shapes

@Composable
fun ImageList(viewModel: BloomViewModel = viewModel()) {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(items = viewModel.items, key = { it.name }) { item ->
            ImageListItem(item = item, checked = item.checked) { checked ->
                viewModel.changeItemChangeStatus(item, checked)
            }
        }
    }
}

@Composable
fun ImageListItem(item: ImageItem, checked: Boolean, onCheckedChange: (Boolean) -> Unit) {
    Row(Modifier
        .fillMaxWidth()
        .height(64.dp)
    ) {
        Image(
            painter = painterResource(id = item.imageRes),
            contentDescription = item.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .clip(Shapes.small)
        )
        Column(Modifier.padding(start = 16.dp)) {
            Row (
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Column {
                    Text(
                        text = item.name,
                        style = MaterialTheme.typography.h2,
                        color = MaterialTheme.colors.onBackground,
                        modifier = Modifier.paddingFromBaseline(top = 24.dp)
                    )
                    Text(
                        text = "This is a description",
                        style = MaterialTheme.typography.body1,
                        color = MaterialTheme.colors.onBackground
                    )
                }
                Checkbox(
                    checked = checked,
                    onCheckedChange = onCheckedChange,
                    colors = CheckboxDefaults.colors(
                        checkedColor = MaterialTheme.colors.secondary
                    ),
                    modifier = Modifier
                        .size(24.dp)
                        .padding(top = 24.dp)
                )
            }
            Divider(Modifier
                .fillMaxWidth()
                .paddingFromBaseline(top = 24.dp))
        }
    }
}