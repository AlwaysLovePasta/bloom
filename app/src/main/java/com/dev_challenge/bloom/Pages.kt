package com.dev_challenge.bloom

sealed class Pages(val route: String) {
    object WelcomePage: Pages("welcome")
    object LoginPage: Pages("login")
    object HomePage: Pages("home")
}