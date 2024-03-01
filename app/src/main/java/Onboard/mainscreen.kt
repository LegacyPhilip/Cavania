package Onboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.cavania.R

@Composable
fun screenOne(navController: NavController){
    Column(
        horizontalAlignment =  Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffffffff))

    ) {

        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier
//                .border(1.dp, Color.Red)
                .fillMaxWidth()
                .offset( y = (80.dp))
        ){

            Image(painter = painterResource(id = R.drawable.pngfood), contentDescription = "image of traditional food", Modifier.size(260.dp))
        }

        Text(text = "Order for Food",
            style = TextStyle(
                color = Color.Black,
                fontSize = 42.sp,
//                fontWeight = FontWeight.Bold,
            ),
            modifier = Modifier
                .offset(y = 40.dp)
            )
        Text(text = "Confirmation of Deed")


    }
}