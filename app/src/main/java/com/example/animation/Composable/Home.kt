package com.example.animation.Composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Home(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().background(Color.Blue)
    ) {
        Button(onClick = { navController.navigate("home_two") }, colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Red,
            contentColor = Color.White
        ), modifier = Modifier
            .height(100.dp)
            .size(300.dp)) {
            Text(text = "Press me Home2", fontSize = 26.sp)
        }
    }
}

@Composable
fun Home2(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().background(Color.Magenta)
    ) {
        Button(onClick = { navController.navigate("home_one") }, colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Red,
            contentColor = Color.White
        ), modifier = Modifier
            .height(100.dp)
            .width(300.dp)) {
            Text(text = "Press me Home1", fontSize = 26.sp)
        }
        Spacer(modifier = Modifier.padding(50.dp))
        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Green,
            contentColor = Color.White
        ), modifier = Modifier.height(100.dp)
            .width(300.dp)) {
            Text(text = "Press me Home3", fontSize = 26.sp)
        }
    }
}

@Composable
fun Home3() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().background(Color.Gray)
    ) {
        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Green,
            contentColor = Color.White
        ), modifier = Modifier.height(100.dp)
            .width(300.dp)) {
            Text(text = "Press me Home2", fontSize = 26.sp)
        }
    }
}