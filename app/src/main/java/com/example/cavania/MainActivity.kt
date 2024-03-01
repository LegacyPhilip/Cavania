package com.example.cavania
import Security.AccountSign
import Security.LoginScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.cavania.ui.theme.CavaniaTheme
import packs.BeanchMark
import packs.DescriptiveDetail
import packs.HomeView
import packs.OrderSummary
import utilities.NavigatingPanel
import utilities.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CavaniaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xfffffcf3)
                ) {
                    NavigatingPanel()
//                    AccountSign(navController = navController.navigate(Screen.MainView.route))
//                    BeanchMark()
//                    DescriptiveDetail()



                }
            }
        }
    }
}
