package Security

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import utilities.Wearables

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun AccountSign(){
//    var showDialog by remember { mutableStateOf(false) }
   var fullName by remember { mutableStateOf(false)}
    var phoneNumber by remember{mutableStateOf (false)}
    var passcode by remember{mutableStateOf(false)}
    var cPasscode by remember{mutableStateOf(false)}

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ){



        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 71.dp)
//            .border(1.dp, Color.Black)
        ){
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Image of Logo", Modifier.size(150.dp))
        }
        
        Spacer(modifier = Modifier.height(80.dp))
        Text(
            "Create New Account",
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(20.dp))


        Wearables().createAccount()
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xfff3b061)
            ),
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .offset(y = 12.dp)

        ) {
            Text(text = "Join",
                style = TextStyle(
                    fontSize = 20.sp
                ),
                modifier = Modifier
                    .padding(1.dp)
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 80.dp)
        ){

            Text(
                text = "Already own an Account?",
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Light
                )

            )

            TextButton(onClick = {  },
                colors = ButtonDefaults.buttonColors(
                    containerColor =  Color.Unspecified,
//                    contentColor = Color(0XFF000000)
                ),

                modifier = Modifier
//                    .width(180.dp)
//                    .height(80.dp),
                    .offset(x = 3.dp),
                shape = RoundedCornerShape(6.dp)

            ) {

                Text(
                    "Try Login-In",
                    style = TextStyle(
                        color = Color(0xFF2B73DF),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                    modifier = Modifier
//                            .offset()
//                            .padding(top = 8.dp)
                )
            }

        }



    }
}