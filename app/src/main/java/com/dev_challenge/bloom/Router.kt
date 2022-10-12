package com.dev_challenge.bloom

sealed class Router(val route: String) {
    object WelcomePage: Router("welcome")
    object LoginPage: Router("login")
    object HomePage: Router("home")
}