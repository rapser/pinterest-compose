package com.rapser.pinterest

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

data class Category(val title: String, val imageRes: Int)
data class BottomNavItem(val label: String, val icon: ImageVector)

val bottomNavItems = listOf(
    BottomNavItem("Home", Icons.Filled.Home),
    BottomNavItem("Search", Icons.Filled.Search),
    BottomNavItem("Create", Icons.Filled.Add),
    BottomNavItem("Alerts", Icons.Filled.Notifications),
    BottomNavItem("Saved", Icons.Filled.Person)
)