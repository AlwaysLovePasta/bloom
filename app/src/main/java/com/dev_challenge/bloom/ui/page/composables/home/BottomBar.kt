package com.dev_challenge.bloom.ui.page.composables.home

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

data class NavItem(val name: String, val icon: ImageVector)

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