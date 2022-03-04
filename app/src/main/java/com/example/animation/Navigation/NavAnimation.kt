package com.example.animation.Navigation

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.navArgument
import com.example.animation.Composable.Home
import com.example.animation.Composable.Home2
import com.example.animation.Composable.Home3
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@ExperimentalAnimationApi
@Composable
fun NavAnimation() {
    val navController = rememberAnimatedNavController()
    AnimatedNavHost(
        navController = navController, startDestination = "home_one") {
        composable(
            "home_one",
            enterTransition = { initial, _ ->
                when (initial.destination.route) {
                    "home_two" ->
                        slideIntoContainer(AnimatedContentScope.SlideDirection.Left, animationSpec = tween(800))
                    else -> null
                }
            },
            exitTransition = { _, target ->
                when (target.destination.route) {
                    "home_two" ->
                        slideOutOfContainer(AnimatedContentScope.SlideDirection.Left, animationSpec = tween(800))
                    else -> null
                }
            },
            popEnterTransition = { initial, _ ->
                when (initial.destination.route) {
                    "home_two" ->
                        slideIntoContainer(AnimatedContentScope.SlideDirection.Right, animationSpec = tween(800))
                    else -> null
                }
            },
            popExitTransition = { _, target ->
                when (target.destination.route) {
                    "home_two" ->
                        slideOutOfContainer(AnimatedContentScope.SlideDirection.Right, animationSpec = tween(800))
                    else -> null
                }
            }
        ){
            Home(navController)
        }
        composable(
            "home_two",
            enterTransition = { initial, _ ->
                when (initial.destination.route) {
                    "home_one" ->
                        slideIntoContainer(AnimatedContentScope.SlideDirection.Left, animationSpec = tween(800))
                    else -> null
                }
            },
            exitTransition = { _, target ->
                when (target.destination.route) {
                    "home_three" ->
                        slideOutOfContainer(AnimatedContentScope.SlideDirection.Left, animationSpec = tween(800))
                    else -> null
                }
            },
            popEnterTransition = { initial, _ ->
                when (initial.destination.route) {
                    "home_three" ->
                        slideIntoContainer(AnimatedContentScope.SlideDirection.Right, animationSpec = tween(800))
                    else -> null
                }
            },
            popExitTransition = { _, target ->
                when (target.destination.route) {
                    "home_one" ->
                        slideOutOfContainer(AnimatedContentScope.SlideDirection.Right, animationSpec = tween(800))
                    else -> null
                }
            }
        ){
            Home2(navController)
        }
        composable(
            "home_three",
            enterTransition = { initial, _ ->
                when (initial.destination.route) {
                    "home_two" ->
                        slideIntoContainer(AnimatedContentScope.SlideDirection.Left, animationSpec = tween(800))
                    else -> null
                }
            },
            exitTransition = { _, target ->
                when (target.destination.route) {
                    "home_two" ->
                        slideOutOfContainer(AnimatedContentScope.SlideDirection.Left, animationSpec = tween(800))
                    else -> null
                }
            },
            popEnterTransition = { initial, _ ->
                when (initial.destination.route) {
                    "home_two" ->
                        slideIntoContainer(AnimatedContentScope.SlideDirection.Right, animationSpec = tween(800))
                    else -> null
                }
            },
            popExitTransition = { _, target ->
                when (target.destination.route) {
                    "home_two" ->
                        slideOutOfContainer(AnimatedContentScope.SlideDirection.Right, animationSpec = tween(800))
                    else -> null
                }
            }
        ){
            Home3(navController)
        }
    }
}