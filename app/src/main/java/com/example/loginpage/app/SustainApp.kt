package com.example.loginpage.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.loginpage.navigation.PostOfficeAppRouter
import com.example.loginpage.navigation.Screen
import com.example.loginpage.screens.SignUpScreen
import com.example.loginpage.screens.TermsAndConditionsScreen

@Composable
fun SusApp(){
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ){
        Crossfade(targetState = PostOfficeAppRouter.currentScreen, label = "") {
            currentState ->
            when (currentState.value){
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }
                is Screen.TermsAndConditionsScreen -> {
                    TermsAndConditionsScreen()
                }
            }
            
        }
    }
}