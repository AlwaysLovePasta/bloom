package com.dev_challenge.bloom.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.dev_challenge.bloom.R

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.nunitosans_bold, FontWeight.Bold)),
        fontSize = 18.sp
    ),
    h2 = TextStyle(
        fontFamily = FontFamily(Font(R.font.nunitosans_bold, FontWeight.Bold)),
        fontSize = 14.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.nunitosans_light, FontWeight.Light)),
        fontSize = 16.sp
    ),
    body1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.nunitosans_light, FontWeight.Light)),
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        fontFamily = FontFamily(Font(R.font.nunitosans_light, FontWeight.Light)),
        fontSize = 12.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily(Font(R.font.nunitosans_semibold, FontWeight.SemiBold)),
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily(Font(R.font.nunitosans_semibold, FontWeight.SemiBold)),
        fontSize = 12.sp
    )
)