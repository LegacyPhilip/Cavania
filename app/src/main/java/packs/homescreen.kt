package packs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
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
import androidx.navigation.NavController
import com.example.cavania.R
import utilities.Screen
import utilities.Wearables

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController) {
    var searchfield by remember { mutableStateOf("") }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
        ,
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)

    ) {
        item {
            // Heading Section
            Wearables().HeadingSection()

            // Special Offers
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Special Offers",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.weight(1f)
                )

                TextButton(
                    onClick = {  }
                ) {
                    Text(
                        "See All",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF35F001)
                        )
                    )
                }
            }

            Wearables().GreatTaste()



            Spacer(modifier = Modifier.height(20.dp))

            // Popular Listing
            Text(
                text = "Popular Listing",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp
                ),
                modifier = Modifier.padding(start = 8.dp)
            )

            // Popular Listing Items
            // Row with listing items

            Spacer(modifier = Modifier.height(22.dp))
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

                    IconButton(onClick = { navController.navigate(Screen.ListDetail.route) }) {


                        Icon(
                            painter = painterResource(id = R.drawable.resturant),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.size(50.dp)
                        )
                    }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            "Restaurant",
                            style = TextStyle(
                                fontSize = 12.sp,
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

                    IconButton(onClick = { navController.navigate(Screen.ListDetail.route) }) {
                        Icon(
                            painter = painterResource(id = R.drawable.foodstand),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.size(50.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        "food stand",
                        style = TextStyle(
                            fontSize = 12.sp,
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
                    IconButton(onClick = { navController.navigate(Screen.ListDetail.route) }) {
                        Icon(
                            painter = painterResource(id = R.drawable.fries),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.size(50.dp)
                        ) }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            "Fried yam",
                            style = TextStyle(
                                fontSize = 12.sp,
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

                    IconButton(onClick = { navController.navigate(Screen.ListDetail.route) }) {
                        Icon(
                            painter = painterResource(id = R.drawable.shawama),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.size(50.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        "Shawama",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xC9000122)
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Order Listing
            Text(
                text = "Order Listing",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp
                ),
                modifier = Modifier.padding(start = 8.dp)
            )

            // Order Listing Items
            // Row with order listing items
            Spacer(modifier = Modifier.height(22.dp))
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

                    IconButton(onClick = { navController.navigate(Screen.ListDetail.route) }) {
                        Icon(
                            painter = painterResource(id = R.drawable.shops),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.size(50.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        "Igbo Man",
                        style = TextStyle(
                            fontSize = 12.sp,
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

                    IconButton(onClick = { navController.navigate(Screen.ListDetail.route) }) {
                        Icon(
                            painter = painterResource(id = R.drawable.gas),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.size(50.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        "Gas",
                        style = TextStyle(
                            fontSize = 12.sp,
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

                    IconButton(onClick = { navController.navigate(Screen.ListDetail.route) }) {
                        Icon(
                            painter = painterResource(id = R.drawable.fuel),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.size(50.dp)
                        ) }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            "Fuel",
                            style = TextStyle(
                                fontSize = 12.sp,
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

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.support),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.size(50.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        "Personal Order",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xC9000122)
                        )
                    )
                }
            }



            Spacer(modifier = Modifier.height(20.dp))

            // Discover Great Taste
            Text(
                text = "Discover Great Taste",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                ),
                modifier = Modifier.padding(start = 8.dp)
            )

            // Related Listings
            Wearables().DescDetail()
//            Wearables().GreatTastes()
        }
    }
}