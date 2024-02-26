package Onboard
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cavania.R

@Composable
fun homeScreen2(){
    Column(
        horizontalAlignment =  Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffffffff))

    ) {
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (140.dp))
        ){
            Image(painter = painterResource(id = R.drawable.delivery), contentDescription = "image of traditional food", Modifier.size(300.dp))
        }
        Spacer(
            Modifier.height(60.dp)
        )
        Text(text = "Fast Delivery",
            style = TextStyle(
                color = Color(0xfff3b061),
                fontSize = 37.sp,
                fontWeight = FontWeight.Bold,
            ),
            modifier = Modifier
                .offset(y = 40.dp)
        )
        Text(
            modifier = Modifier
                .offset(y = 40.dp)
                .width(260.dp)
            ,
            text = "place order for any type of food from the comfort of your home with no stress from anywhere at anytime",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        )
        Spacer(modifier = Modifier.height(52.dp))
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xfff3b061)
            ),
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .offset(y = 142.dp)

        ) {
            Text(text = "Next",
                style = TextStyle(
                    fontSize = 20.sp
                ),
                modifier = Modifier
                    .padding(1.dp)
            )
        }
    }
}