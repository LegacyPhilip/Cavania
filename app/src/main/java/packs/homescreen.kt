package packs

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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import utilities.Wearables

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(){

    var searchfield by remember { mutableStateOf("")}
    LazyColumn(
        modifier = Modifier
            .background(Color(0xFFFFFFFF))
            .fillMaxSize()
    ) {
        item(1) {

            Wearables().HeadingSection()

//        [][][][][][][][][][][][][ Offers ][][][][][][][]][][][][]
            Row(
                modifier = Modifier
                    .padding(top = 30.dp, end = 22.dp, start = 22.dp)
//                .border(1.dp, Color.Red)
                    .fillMaxWidth()
            ) {

                Text(
                    "Special Offers",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                )

                TextButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .offset(y = -(15.dp), x = 88.dp)
                ) {
                    Text(
                        "See All",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF35F001)
                        ),
                        modifier = Modifier
                            .fillMaxWidth(0.6f)
                    )
                }
            }

//       [][][][]][][][][][][][][ Special offer advert ][][][][]]]][][]]

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = -(14).dp)
                    //                .padding(start = 22.dp, end = 22.dp)

//                    .fillMaxHeight(0.8f)
                    .border(1.dp, Color(0x4DB9B4B4))

            ) {

               Box(
                   modifier = Modifier
                       .fillMaxWidth(0.5f)
                       .fillMaxHeight()
                       .offset(x = 28.dp)
//                       .border(1.dp, Color.Red)
               ) {
                   Column {
                       Text(
                           text = "30% Discount",
                           style = TextStyle(
                               fontWeight = FontWeight.Bold,
                               fontSize = 23.sp,
                           ),

                           modifier = Modifier
                               .padding(top =  30.dp)
                       )

                       Text(
                           text = "Get the best of taste , enjoy every sallow and feel the richness in every meal",
                           style = TextStyle(
                               fontWeight = FontWeight.Bold,
                               fontSize = 14.sp,
                               color = Color(0xCB3A3838),
                               textAlign = TextAlign.Justify
                           ),

                           modifier = Modifier
                               .padding(top = 7.dp)
                               .fillMaxWidth(0.7f)
                       )

                       Button(onClick = { /*TODO*/ },

                           colors = ButtonDefaults.buttonColors(
                               containerColor =  Color(0xffffda05)
                           ),
                           modifier = Modifier
                               .width(120.dp)
                               .height(32.dp)
                               .offset(y = 20.dp)

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
                   }
               }
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()

//                        .border(1.dp, Color.Red)
                ){
                    Image(painter = painterResource(id = R.drawable.listing4), contentDescription = null, contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .offset(x = -(40).dp)
                    )
                }
//                    Image(painter = painterResource(id = R.drawable.spbanner3), contentDescription = null, contentScale = ContentScale.Crop, )
            }


            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Popular Listing",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                ),
                modifier = Modifier
                    .padding(start = 22.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
//                .border(1.dp, Color.Red)
                    .padding(start = 42.dp, end = 42.dp)
                    .fillMaxWidth()
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
//                    .border(1.dp, Color.Black)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.stand),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(64.dp)
                    )
                    Text(
                        "Restaurant",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xC9000122)
                        )
                    )
                }
                Spacer(modifier = Modifier.width(20.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
//                    .border(1.dp, Color.Black)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.stand),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(64.dp)
                    )
                    Text(
                        "Shawama",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xC9000122)
                        )
                    )
                }
                Spacer(modifier = Modifier.width(18.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
//                    .border(1.dp, Color.Black)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.stand),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(64.dp)
                    )
                    Text(
                        "Fired yam",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xC9000122)
                        )
                    )
                }
                Spacer(modifier = Modifier.width(18.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
//                    .border(1.dp, Color.Black)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.stand),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(64.dp)
                    )
                    Text(
                        "Food Stand",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xC9000122)
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(35.dp))
            Text(
                text = "Order Listing",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                ),
                modifier = Modifier
                    .padding(start = 22.dp)
            )


            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
//                .border(1.dp, Color.Red)
                    .padding(start = 42.dp, end = 42.dp)
//                .fillMaxWidth()
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
//                    .border(1.dp, Color.Black)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.stand),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(64.dp)
                    )
                    Text(
                        "Igbo Man",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xC9000122)
                        )
                    )
                }
                Spacer(modifier = Modifier.width(18.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
//                    .border(1.dp, Color.Black)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.stand),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(64.dp)
                    )
                    Text(
                        "Tallest Gas",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xC9000122)
                        )
                    )
                }
                Spacer(modifier = Modifier.width(18.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
//                    .border(1.dp, Color.Black)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.stand),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(64.dp)
                    )
                    Text(
                        "Fired yam",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xC9000122)
                        )
                    )
                }
                Spacer(modifier = Modifier.width(18.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
//                    .border(1.dp, Color.Black)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.stand),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(64.dp)
                    )
                    Text(
                        "Fuel ",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xC9000122)
                        )
                    )
                }
            }

//        [][][][][][][][][][][[][][[ Related Listing ][][][][][][][][][][][][
            Spacer(modifier = Modifier.height(35.dp))
            Text(
                text = "Discover Great Taste",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                ),
                modifier = Modifier
                    .padding(start = 22.dp)
            )

            Wearables().GreatTaste()

//        Wearables().GreatTaste()
        }
    }
}