package utilities

import Onboard.homeScreen
import Onboard.homeScreen2
import Onboard.homeScreen3
import Onboard.screenOne
import Security.AccountSign
import Security.LoginScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import packs.BeanchMark
import packs.DescriptiveDetail
import packs.HomeView
import packs.OrderSummary

@Composable
fun NavigatingPanel(){
    var navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.HotLine1.route){
        composable(Screen.HotLine1.route){
            homeScreen(navController = navController)
        }

        composable(Screen.HotLine2.route){
            homeScreen2(navController = navController)
        }

        composable(Screen.Hotline3.route){
            homeScreen3(navController = navController)
        }
        composable(Screen.CreateHome.route){
            AccountSign(navController = navController)
        }
        composable(Screen.Login.route){
            LoginScreen(navController = navController)
        }
        composable(Screen.HotScreen.route){
            screenOne(navController = navController)
        }
        composable(Screen.ListDetail.route){
            BeanchMark(navController = navController)
        }
        composable(Screen.DescListing.route){
            DescriptiveDetail(navController = navController)
        }
        composable(Screen.OrderingSumarry.route){
            OrderSummary(navController = navController)
        }
        composable(Screen.MainView.route){
            HomeView(navController = navController)
        }
    }
}