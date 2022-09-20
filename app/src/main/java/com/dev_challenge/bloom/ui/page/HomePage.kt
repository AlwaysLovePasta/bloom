package com.dev_challenge.bloom.ui.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev_challenge.bloom.R
import com.dev_challenge.bloom.ui.theme.*

data class CardItem(val name: String, val image: Painter)
data class ListItem(val image: Painter, val name: String)
data class NavItem(val name: String, val icon: ImageVector)

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
            HomeSearchBar()
            HomeCardTitle()
            Spacer(modifier = Modifier.height(16.dp))
            HomeCardRows()
            HomeImageTitle()
            Spacer(modifier = Modifier.height(16.dp))
            HomeImageList()
        }
    }
}

@Composable
fun HomeSearchBar() {
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

@Composable
fun HomeCardTitle() {
    Box(
        Modifier
            .fillMaxWidth()
            .height(32.dp),
        contentAlignment = Alignment.BottomStart
    ) {
        Text(
            text = "Browse themes",
            style = MaterialTheme.typography.h1,
            color = MaterialTheme.colors.onBackground,
            textAlign = TextAlign.Start
        )
    }
}

@Composable
fun HomeCardRows() {
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

@Composable
fun HomeImageTitle() {
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

@Composable
fun HomeImageList() {
    val listItems = listOf(
        ListItem(painterResource(id = R.drawable.monstera), "Monstera"),
        ListItem(painterResource(id = R.drawable.aglaonema), "Aglaonema"),
        ListItem(painterResource(id = R.drawable.peace_lily), "Peace lily"),
        ListItem(painterResource(id = R.drawable.fiddle_leaf), "Fiddle leaf tree"),
        ListItem(painterResource(id = R.drawable.snake_plant), "Snake plant"),
        ListItem(painterResource(id = R.drawable.pothos), "Pothos")
    )

    var checked by remember { mutableStateOf(false) }
    
    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(items = listItems, key = { it.name }) {
            Row(Modifier
                .fillMaxWidth()
                .height(64.dp)
            ) {
                Image(
                    painter = it.image, 
                    contentDescription = it.name,
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
                                text = it.name,
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
                            checked = checked ,
                            onCheckedChange = { checked = it },
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
    }
}

@Composable
fun BottomBar() {
    val navItems = listOf (NavItem("Home", Icons.Default.Home),
        NavItem("Favorites", Icons.Default.FavoriteBorder),
        NavItem("Profile", Icons.Default.AccountCircle),
        NavItem("Cart", Icons.Default.ShoppingCart)
    )

    BottomNavigation(
        Modifier
            .fillMaxWidth()
            .height(56.dp),
        backgroundColor = MaterialTheme.colors.primary
    ) {
        navItems.forEach {
            BottomNavigationItem(
                selected = ("Home" == it.name),
                onClick = { /*TODO*/ },
                icon = { Icon(imageVector = it.icon, contentDescription = it.name, Modifier.size(24.dp)) },
                label = { Text(
                    text = it.name,
                    style = MaterialTheme.typography.caption,
                    color = MaterialTheme.colors.onPrimary
                ) }
            )
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun PreviewHomePage() {
    HomePage()
}