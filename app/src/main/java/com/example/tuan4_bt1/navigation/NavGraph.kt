package com.example.tuan4_bt1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tuan4_bt1.screens.DetailScreen
import com.example.tuan4_bt1.screens.ListScreen
import com.example.tuan4_bt1.screens.RootScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.Root.route
    ) {
        composable(Screens.Root.route) { RootScreen(navController) }
        composable(Screens.List.route) { ListScreen(navController) }
        composable(Screens.Detail.routeWithArg) { backStackEntry ->
            DetailScreen(
                navController,
                backStackEntry.arguments?.getString(Screens.Detail.arg)
            )
        }
    }
}