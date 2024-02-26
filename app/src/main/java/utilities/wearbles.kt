package utilities

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cavania.R

@OptIn(ExperimentalMaterial3Api::class)
public class Wearables {

    @Composable
    fun createAccount(){
        var fullName by remember { mutableStateOf("")}
        var phoneNumber by remember{mutableStateOf ("")}
        var passcode by remember{mutableStateOf("")}
        var cPasscode by remember{mutableStateOf("")}


           OutlinedTextField(
            value = fullName,
            onValueChange = { fullName = it },
            modifier = Modifier
                .fillMaxWidth()
                .clipToBounds()
                .padding(top = 15.dp, start = 22.dp, end = 22.dp),
             colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color(0xFFC0BFBF),
                unfocusedIndicatorColor = Color.Transparent,
                containerColor = Color(0x7202020)
            ),
               label = {
                   Text(
                       "Full Name",
                       style =  TextStyle(
                           fontSize = 17.sp,
                           fontWeight = FontWeight.Bold,
                           color = Color(0xFF696868)
                       )
                   )
               },
               trailingIcon = {

                   Icon(painter = painterResource(id = R.drawable.user ),
                       contentDescription = null,
                       tint = Color.Unspecified,
                       modifier = Modifier
                           .size(32.dp)
                       )
               },

            )

        Spacer(Modifier.height(10.dp))
        OutlinedTextField(
            value = phoneNumber,
            onValueChange = { phoneNumber = it },
            modifier = Modifier
                .fillMaxWidth()
                .clipToBounds()
                .padding(top = 15.dp, start = 22.dp, end = 22.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color(0xFFC0BFBF),
                unfocusedIndicatorColor = Color.Transparent,
                containerColor = Color(0x7202020)
            ),
            label = {
                Text(
                    "Phone Number",
                    style =  TextStyle(
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF696868)
                    )
                )
            },
            trailingIcon = {

                Icon(painter = painterResource(id = R.drawable.phone ),
                    contentDescription = null,
                    tint = Color.Unspecified,
                   modifier = Modifier
                       .size(32.dp)
                )
            },

            )

        Spacer(Modifier.height(10.dp))
        OutlinedTextField(
            value = passcode,
            onValueChange = { passcode = it },
            modifier = Modifier
                .fillMaxWidth()
                .clipToBounds()
                .padding(top = 15.dp, start = 22.dp, end = 22.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color(0xFFC0BFBF),
                unfocusedIndicatorColor = Color.Transparent,
                containerColor = Color(0x7202020)
            ),
            label = {
                Text(
                    "Passcode",
                    style =  TextStyle(
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF696868)
                    )
                )
            },
            trailingIcon = {

                Icon(painter = painterResource(id = R.drawable.password ),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .size(32.dp)
                )
            },

            )
        Spacer(Modifier.height(10.dp))
        OutlinedTextField(
            value = cPasscode,
            onValueChange = { cPasscode = it },
            modifier = Modifier
                .fillMaxWidth()
                .clipToBounds()
                .padding(top = 15.dp, start = 22.dp, end = 22.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color(0xFFC0BFBF),
                unfocusedIndicatorColor = Color.Transparent,
                containerColor = Color(0x7202020)
            ),
            label = {
                Text(
                    "Confirm Passcode",
                    style =  TextStyle(
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF696868)
                    )
                )
            },
            trailingIcon = {

                Icon(painter = painterResource(id = R.drawable.cpassword ),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .size(32.dp)
                )
            },

            )


    }

//  [][][][][][][][][][][][][][][][][][][][][ Login Popup ][][][][][][][][][][][]][][][][][][][][][][][][][][]
    @Composable
    fun LoginPopup() {
        var showDialog by remember { mutableStateOf(false) }

    var lusername by remember{mutableStateOf("")}

    var lPasscode by remember{mutableStateOf("")}

        Column(
            modifier = Modifier
                .fillMaxSize()
//                .padding(16.dp)
        ) {
            // Button to trigger the popup
            TextButton(onClick = { showDialog = true },
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

            // Dialog
            if (showDialog) {
                AlertDialog(
                    modifier = Modifier
                        .fillMaxHeight(0.8f)
                        .offset(y = 40.dp)
                    ,

                    onDismissRequest = { showDialog = false },
                    title = {
                        Text(text = "Login!",
                            style = TextStyle(
                                textAlign = TextAlign.Center,
                                fontWeight =  FontWeight.Black,
                                fontSize = 30.sp

                            ),
                            modifier = Modifier
                                .fillMaxWidth()
                                .offset(y = 10.dp)
                            )
                    },

                    text = {
                        Text(text = "get access to your account by login in",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Light,
                                textAlign = TextAlign.Center,
                                color = Color(0xFF696868)
                            ),
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    },






                    confirmButton = {
                        Button(onClick = { showDialog = false }) {
                            Text(text = "OK")
                        }
                    }
                )
            }
        }
    }
//[][][][][][][][][][][][][][][][[[]]]][Login Section]]][][][]][[][][][
@Composable
fun Login(){
    var lusername by remember { mutableStateOf("")}
      var lpasscode by remember{mutableStateOf("")}



    OutlinedTextField(
        value = lusername,
        onValueChange = { lusername = it },
        modifier = Modifier
            .fillMaxWidth()
            .clipToBounds()
            .padding(top = 15.dp, start = 22.dp, end = 22.dp),
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color(0xFFC0BFBF),
            unfocusedIndicatorColor = Color.Transparent,
            containerColor = Color(0x7202020)
        ),
        label = {
            Text(
                "Full Name",
                style =  TextStyle(
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF696868)
                )
            )
        },
        trailingIcon = {

            Icon(painter = painterResource(id = R.drawable.user ),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier
                    .size(32.dp)
            )
        },

        )

    Spacer(Modifier.height(10.dp))
    OutlinedTextField(
        value = lpasscode,
        onValueChange = { lpasscode = it },
        modifier = Modifier
            .fillMaxWidth()
            .clipToBounds()
            .padding(top = 15.dp, start = 22.dp, end = 22.dp),
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color(0xFFC0BFBF),
            unfocusedIndicatorColor = Color.Transparent,
            containerColor = Color(0x7202020)
        ),
        label = {
            Text(
                "Passcode",
                style =  TextStyle(
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF696868)
                )
            )
        },
        trailingIcon = {

            Icon(painter = painterResource(id = R.drawable.password ),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier
                    .size(32.dp)
            )
        },

        )


}

//    [][][][][][][][][][]]][][][][][][][][] Great Taste [][][][][][][][][][][][]
    @Composable
    fun GreatTaste(){
        Spacer(modifier = Modifier.height(26.dp))
        Row(
            modifier = Modifier
                .border(1.dp, Color(0x14A2A1A1))
//                .padding(5)
//                .padding(start = 22.dp, end = 22.dp)
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .background(Color(0xFFFFFFFF))
//                .shadow(
//                    elevation = 1.dp,
//                    ambientColor = Color(0xFFFF0000),
//                    spotColor = Color(0xFFB6B3B3),
//                    shape = RoundedCornerShape(2.dp)
//
//                )
        ){
            Box (
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(5.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.listing3),
                    contentDescription = null,
                    //                contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(104.dp)
                    //                    .offset(x = -(10).dp)
                    //                        .border(1.dp, Color.Red)
                )
            }
            Column (
                modifier = Modifier
//                    .fillMaxWidth()
//                    .border(1.dp, Color.Black)

//                    .padding(12.dp)
            ){

                Button(onClick = { /*TODO*/ },

                    colors = ButtonDefaults.buttonColors(
                        containerColor =  Color(0xffffda05)
                    ),
                    modifier = Modifier
                        .width(120.dp)
                        .height(32.dp)
                        .offset(x = 66.dp, y = 15.dp)

                ) {
                    Text(
                        text = "Order Now",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            color = Color(0xffffffff)
                        ),
                        modifier = Modifier
//                        .padding(10.dp)
                    )
                }
                Text(
                    text = "Experience a new taste",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 17.sp,
                        color = Color(0xffffda05)
                    ),
                    modifier = Modifier
                        .offset(x = -(45).dp, y = 26.dp)
//                        .padding(10.dp)
                )

                Text(
                    text = "get the best of taste from the comfort of your home, enjoy the richness of good egusi soup in every sallow",

                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 10.sp,
                        color = Color(0xff808080)
                    ),
                    modifier = Modifier
                        .offset(x = -(45).dp, y = 25.dp)
//                        .padding(10.dp)
                )

                Text(
                    text = "#China's Taste",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        color = Color(0xffffda05)
                    ),
                    modifier = Modifier
                        .offset(x = 66.dp, y = 30.dp)
//                        .padding(10.dp)
                )
            }


        }
    }

    @Composable
    fun HeadingSection(){
        var searchfield by remember { mutableStateOf("")}
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, end = 22.dp, start = 22.dp)
//            .border(1.dp, Color.Red)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .width(45.dp)
                    .height(45.dp)
                    .background(Color(0xFFF1F0F0), RoundedCornerShape(100.dp))
//                .border(1.dp, Color.Green, RoundedCornerShape(100.dp))
            ) {

                Text(
                    text = "L",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                )
            }
//        [][][][][][][][][][][][][ User Details ][][][][][][][][][][][][][][][][]
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.5f)

            ) {
                Text(
                    text = "Vana00021",
                    style = TextStyle(
                        color = Color(0xFFCECECE),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .offset(x = 12.dp, y = 6.dp)

                )

                Text(
                    text = "Legacy Tanadeba",
                    style = TextStyle(
                        color = Color(0xFF202020),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .offset(x = 12.dp, y = 5.dp)

                )
            }



            Box(
                contentAlignment = Alignment.TopEnd,
                modifier = Modifier
//                .border(1.dp, Color.Red)

            ) {
                IconButton(
                    onClick = { },
                    modifier = Modifier
                        .padding(start = 122.dp)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.settings),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }

//        [][][][][][][][][][][]][ Search Bar ][][][][][][][][][][][

        TextField(
            value = searchfield, onValueChange = { searchfield = it },
            placeholder = {
                Text(
                    text = "your meal is just one search away",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400)
                    ),
                    modifier = Modifier
                        .offset(y = 3.dp)
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .clipToBounds()
                .padding(top = 15.dp, start = 22.dp, end = 22.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Unspecified,
                unfocusedIndicatorColor = Color.Transparent,
                containerColor = Color(0x14FFA200)
            ),
            leadingIcon = {

                Icon(
                    painter = painterResource(id = R.drawable.meal),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .size(33.dp)
                )
            },
        )
    }

    @Composable
    fun ListingDetails(){


        Column (
            modifier = Modifier
                .fillMaxWidth()
//                    .fillMaxHeight(0.9f)
                .border(1.dp, Color(0x19F7EABF))
                .padding(start = 18.dp, end = 20.dp)
                .background(Color(0x19F7EABF))
                .shadow(
                    elevation = 4.dp,
                    spotColor = Color(0x81AFAFAF)
                )
//                    .fillMaxHeight(0.9f)

        ){
            Row(
                modifier = Modifier
//                        .fillMaxWidth()

            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
//                        .background(Color(0x51F7F6F6), RoundedCornerShape(100))
//                        .offset(x = 20.dp)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.pngfood),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier
                            .size(65.dp)
//                            .padding(6.dp)
                            .offset(x = 13.dp, y = 30.dp)
                        //                          .border(20.dp, Color.White, RoundedCornerShape(10))

                    )
                }

                //                [][][]][][][][][ Name ][][][][][][][][]

                Column(
                    modifier = Modifier
                        .offset(x = 10.dp, y = 20.dp)
                        .padding(15.dp)
                ) {
                    Text(
                        text = "Chian's  Collection",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                        ),

                        )

                    Text(
                        text = "Sweetness comes with passion",
                        style = TextStyle(
                            fontWeight = FontWeight.Light,
                            fontSize = 14.sp,
                            color = Color(0xE6686767)
                        ),

                        )

                    Text(
                        text = "Our Menu runs from Egusi soup, vegetable soup, white soup, afan etc.",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 10.sp,
                            color = Color(0xD0363535),
                            textAlign =  TextAlign.Justify
                        ),
                        modifier = Modifier
//                        .width(350.dp)
                            .offset(x = 6.dp, y = 5.dp)
//                            .padding(10.dp)
                            .fillMaxWidth(0.7f)
                        )

                }

                Button(
                    onClick = { /*TODO*/ },

                    modifier = Modifier
//                        .width(70.dp)
                        .height(29.dp)
                        .offset(x = 7.dp, y = 29.dp)

                    ,
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 10.dp,
//                               pressedElevation = 50.dp
                    ) ,

                    shape = RoundedCornerShape(topStart = 8.dp, bottomStart = 8.dp) ,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFF6F00)
                    )

                ) {
                    Text(
                        text = "View",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                        ),

                        )
                }
            }

            Row(
//                verticalAlignment = Alignment.TopEnd,
                modifier = Modifier
                    .padding(5.dp)
                    .offset(x = 240.dp)
            ){

                Icon(
                    painter = painterResource(id = R.drawable.ratingfill),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .size(20.dp)
//                            .padding(6.dp)
                        .offset(x = 13.dp, y = 10.dp)
                    //                          .border(20.dp, Color.White, RoundedCornerShape(10))

                )
                Icon(
                    painter = painterResource(id = R.drawable.ratingfill),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .size(20.dp)
//                            .padding(6.dp)
                        .offset(x = 13.dp, y = 10.dp)
                    //                          .border(20.dp, Color.White, RoundedCornerShape(10))

                )
                Icon(
                    painter = painterResource(id = R.drawable.ratingfill),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .size(20.dp)
//                            .padding(6.dp)
                        .offset(x = 13.dp, y = 10.dp)
                    //                          .border(20.dp, Color.White, RoundedCornerShape(10))

                )
                Icon(
                    painter = painterResource(id = R.drawable.ratingfill),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .size(20.dp)
//                            .padding(6.dp)
                        .offset(x = 13.dp, y = 10.dp)
                    //                          .border(20.dp, Color.White, RoundedCornerShape(10))

                )
                Icon(
                    painter = painterResource(id = R.drawable.ratingfill),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .size(20.dp)
//                            .padding(6.dp)
                        .offset(x = 13.dp, y = 10.dp)
                    //                          .border(20.dp, Color.White, RoundedCornerShape(10))

                )

            }


            Spacer(modifier = Modifier.height(12.dp))
        }
    }

    @Composable
    fun DescDetail(){

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f)
                .border(1.dp, Color(0x19F7EABF))
                .padding(start = 18.dp, end = 20.dp)
                .background(Color(0xFFFFFFFF), RoundedCornerShape(topEnd = 20.dp))
                .shadow(
                    elevation = 4.dp,
                    spotColor = Color(0x81AFAFAF)
                )
        ){
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth(0.4f)
                    .fillMaxHeight()
                    .offset(y = 22.dp, x = 10.dp)

//                        .background(Color(0xFFFFFFFF))
//                    .shadow(
//                        elevation = 4.dp,
//                        spotColor = Color(0x37AFAFAF),
//                        shape = RoundedCornerShape(topEnd = 30.dp,)
//                    )
            ) {

                Image(
                    painter = painterResource(id = R.drawable.pngfood),
                    contentDescription = null,

//                        tint = Color.Unspecified,
                    modifier = Modifier
                        .size(130.dp)
                        .offset(x = -(7).dp)
//                            .padding(6.dp)
                    //                          .border(20.dp, Color.White, RoundedCornerShape(10))

                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xCFFFFFF),)
            ) {
                Box(
                    contentAlignment = Alignment.TopEnd,
                    modifier = Modifier
                        .fillMaxWidth()
//                        .border(1.dp, Color.Blue)
                        .padding(end = 3.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.lite),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier
                            .size(32.dp)
//                            .offset(x = 22.dp)
                    )
                }

                Text(
                    text = "Vegetable Soup",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                    ),

                    modifier = Modifier
                        .offset(y = -(10.dp), x = 10.dp)
                        .padding(10.dp)

                )
                Text(
                    text = "soup with 3 raps of garri",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                        color = Color(0xDA555353)

                    ),
                    modifier = Modifier
                        .offset(y = -(20).dp, x = 10.dp)
                        .padding(10.dp)
                )
                Text(
                    text = "Buy two and get 20% discount when you buy from cavania",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 10.sp,
                        color = Color(0xDA9C9C9C)
                    ),
                    modifier = Modifier
                        .offset(y = -(35.dp), x = 10.dp)
                        .padding(10.dp)
                        .width(150.dp)
                )

                Row (
                    modifier = Modifier
//                        .padding(10.dp)
                ){
                    Text(
                        text = "N750",
                        style = TextStyle(
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 20.sp,
                            color = Color(0xFFFF6F00)
                        ),
                        modifier = Modifier
                            .offset(y = -(37).dp, x = 20.dp)
//                            .padding(10.dp)
                    )
//                    [][][][][][][][][][][][][Order][][][][][][][][][

                    Box(
                        contentAlignment = Alignment.TopEnd,
                        modifier = Modifier
                            .fillMaxWidth()
//                        .border(1.dp, Color.Blue)
                            .padding(end = 3.dp)
                            .offset(y = -(10.dp))
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFFF6F00)
                            ),
                            shape = RoundedCornerShape(5.dp),
                           elevation = ButtonDefaults.buttonElevation(
                               defaultElevation = 10.dp,
//                               pressedElevation = 50.dp
                           ) ,
                            modifier = Modifier
                                .height(28.dp)
                                .width(120.dp)


                            //                        .background(Color(0xFFFF6F00))


                        ) {

                            Text(text = "Order Now",
                                style = TextStyle(
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 11.sp
                                ),
                                modifier = Modifier
                                    .offset(y = -(2.dp))
                            )
                        }
                    }


                }


            }
        }
    }

}