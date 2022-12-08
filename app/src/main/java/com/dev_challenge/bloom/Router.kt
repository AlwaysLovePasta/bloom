package com.dev_challenge.bloom

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dev_challenge.bloom.ui.page.HomePage
import com.dev_challenge.bloom.ui.page.LoginPage
import com.dev_challenge.bloom.ui.page.WelcomePage

sealed class Router(val routeName: String, val entry: @Composable () -> Unit) {
    object WelcomePage: Router("welcome", { WelcomePage() })
    object LoginPage: Router("login", { LoginPage() })
    object HomePage: Router("home", { HomePage() })
}

@Composable
fun RouterBuilder(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Router.WelcomePage.routeName
    ) {
        composable(Router.WelcomePage.routeName) { Router.WelcomePage.entry.invoke() }
        composable(Router.LoginPage.routeName) { Router.LoginPage.entry.invoke() }
        composable(Router.HomePage.routeName) { Router.HomePage.entry.invoke() }
    }
}

internal val LocalNavController = 
    staticCompositionLocalOf<NavHostController> { error("Must provide default value in CompositionLocalProvider!") }

val routerController: NavHostController
    @Composable
    @ReadOnlyComposable
    get() = LocalNavController.current