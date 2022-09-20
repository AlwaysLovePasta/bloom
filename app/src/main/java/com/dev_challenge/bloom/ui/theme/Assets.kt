package com.dev_challenge.bloom.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.dev_challenge.bloom.R

class BloomAssets(val background: Int, val illos: Int, val logo: Int)

fun lightBloomAssets(
    background:Int = R.drawable.ic_light_welcome_bg,
    illos:Int = R.drawable.ic_light_welcome_illos,
    logo:Int = R.drawable.ic_light_logo
): BloomAssets = BloomAssets(background, illos, logo)

fun darkBloomAssets(
    background:Int = R.drawable.ic_dark_welcome_bg,
    illos:Int = R.drawable.ic_dark_welcome_illos,
    logo:Int = R.drawable.ic_dark_logo
): BloomAssets = BloomAssets(background, illos, logo)

internal val LocalAssets = staticCompositionLocalOf { lightBloomAssets() }

@Suppress("unused")
val MaterialTheme.assets: BloomAssets
    @Composable
    @ReadOnlyComposable
    get() = LocalAssets.current