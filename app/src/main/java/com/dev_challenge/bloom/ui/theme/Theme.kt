package com.dev_challenge.bloom.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.compose.rememberNavController
import com.dev_challenge.bloom.LocalNavController

private val DarkColorPalette = darkColors(
    primary = Green900,
    onPrimary = White,
    primaryVariant = Green900,
    secondary = Green300,
    onSecondary = Gray,
    surface = White150,
    onSurface = White850,
    background = Gray,
    onBackground = White

)

private val LightColorPalette = lightColors(
    primary = Pink100,
    onPrimary = Gray,
    primaryVariant = Pink100,
    secondary = Pink900,
    onSecondary = White,
    surface = White850,
    onSurface = Gray,
    background = White,
    onBackground = Gray
    )

@Composable
fun BloomTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {

    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    val assets = if (darkTheme) {
        darkBloomAssets()
    } else {
        lightBloomAssets()
    }

    CompositionLocalProvider(
        LocalAssets provides assets,
        LocalNavController provides rememberNavController()
    ) {
        MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}