package com.example.tuan4_bt1.navigation

sealed class Screens(val route: String) {
    object Root : Screens("root")
    object List : Screens("list")
    object Detail : Screens("detail") {
        const val arg = "itemId"
        val routeWithArg = "$route/{$arg}"
    }
}