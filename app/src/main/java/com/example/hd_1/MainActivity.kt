package com.example.hd_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hd_1.navigation.NavGraph
import com.example.hd_1.ui.theme.HD_1Theme
import com.example.hd_1.user_interface.HomeScreen
import com.example.hd_1.user_interface.auth.components.ForgotPasswordScreen
import com.example.hd_1.user_interface.auth.login.LoginScreen
import com.example.hd_1.user_interface.auth.logup.LogUpScreen
import com.example.hd_1.user_interface.onBoarding.OnboardingScreen
import com.example.hd_1.user_interface.search.components.SearchListCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HD_1Theme {
               NavGraph(
                   context = this@MainActivity
               )
            }
        }
    }
}

