package com.example.todoapp3.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.todoapp3.view.EditItemScreen
import com.example.todoapp3.view.TodoListScreen
import com.example.todoapp3.viewModels.TodoItemsViewModel

@Composable
fun AppScreen(
    navController: NavHostController,
    todoItemsViewModel : TodoItemsViewModel
) {
    NavHost(
        navController = navController,
        startDestination = "appScreen",
    ){
        navigation(
            route = "appScreen",
            startDestination = MainDestinations.HOME_LIST
        ) {
            composable(MainDestinations.ITEM_SCREEN) {
                EditItemScreen(todoItemsViewModel = todoItemsViewModel, navController = navController)
            }
            composable(MainDestinations.HOME_LIST) {
                TodoListScreen(todoItemsViewModel = todoItemsViewModel, navController = navController)
            }
        }
    }
}

object MainDestinations {
    const val HOME_LIST = "todoListScreen"
    const val ITEM_SCREEN = "editItemScreen"
}