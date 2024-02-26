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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.sp
import com.example.cavania.R
import utilities.Wearables

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderSummary(){
    var quantity by remember { mutableStateOf("") }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffffffff))
    ){
        item(1){
            Wearables().HeadingSection()

//    [][][][][][][][][][][][][]][[ List of offers ]][][][][][][][][][][][][]


            Text(
                "Summary",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(22.dp)
            )


// ][][][][][][][][][][][][][][ Summary Detail ][][][][][][][][][][]

            Box (
                contentAlignment = Alignment.TopCenter,
                modifier = Modifier
                    .fillMaxWidth()

            ){
                Image(
                    painter = painterResource(id = R.drawable.pngfood),
                    contentDescription = null,

//                        tint = Color.Unspecified,
                    modifier = Modifier
                        .size(200.dp)
                        .offset(x = -(7).dp)
//                            .padding(6.dp)
                    //                          .border(20.dp, Color.White, RoundedCornerShape(10))

                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 22.dp, end = 22.dp)
//                    .border(1.dp, Color.Red)
            ){
                //  [][][][][][][][][][ Item  ][][][][][][][][][][][]
            Box (
                modifier = Modifier
                    .fillMaxWidth(0.4f)
//                    .border(1.dp, Color.Black)
            ) {
                Text(
                    "Item",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color =  Color(0xFF681106)
                    ),
                )
            }

//  [][][][][][][][][][ Item Type ][][][][][][][][][][][]
                Box (
                    contentAlignment = Alignment.TopEnd,
                    modifier = Modifier
                        .fillMaxWidth()
//                        .border(1.dp, Color.Green)
                ) {
                    Text(
                        "Vegetable Soup",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color =  Color(0xFF681106),
                            textAlign = TextAlign.End
                        ),
                        modifier = Modifier
//                            .offset(x = 80.dp)
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(40.dp))

//            [][][][][][][][][][][][][ Extra ][][][][]
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 22.dp, end = 22.dp)
//                    .border(1.dp, Color.Red)
            ){
                //  [][][][][][][][][][ Item  ][][][][][][][][][][][]
                Box (
                    modifier = Modifier
                        .fillMaxWidth(0.4f)
//                    .border(1.dp, Color.Black)
                ) {
                    Text(
                        "Comes with",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color =  Color(0xFF681106)
                        ),
                    )
                }

//  [][][][][][][][][][ Item Type ][][][][][][][][][][][]
                Box (
                    contentAlignment = Alignment.TopEnd,
                    modifier = Modifier
                        .fillMaxWidth()
//                        .border(1.dp, Color.Green)
                ) {
                    Text(
                        "4 foufou",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color =  Color(0xFF681106),
                            textAlign = TextAlign.End
                        ),
                        modifier = Modifier
//                            .offset(x = 80.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(40.dp))

//            [][][][][][][][][][][][][ Amount ][][][][]
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 22.dp, end = 22.dp)
//                    .border(1.dp, Color.Red)
            ){
                //  [][][][][][][][][][ Item  ][][][][][][][][][][][]
                Box (
                    modifier = Modifier
                        .fillMaxWidth(0.4f)
//                    .border(1.dp, Color.Black)
                ) {
                    Text(
                        "Price",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color =  Color(0xFF681106)
                        ),
                    )
                }

//  [][][][][][][][][][ Item Type ][][][][][][][][][][][]
                Box (
                    contentAlignment = Alignment.TopEnd,
                    modifier = Modifier
                        .fillMaxWidth()
//                        .border(1.dp, Color.Green)
                ) {
                    Text(
                        "N750",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color =  Color(0xFF681106),
                            textAlign = TextAlign.End
                        ),
                        modifier = Modifier
//                            .offset(x = 80.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(40.dp))

//            [][][][][][][][][][][][][ Quantity ][][][][]
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 22.dp, end = 22.dp)
//                    .border(1.dp, Color.Red)
            ){
                //  [][][][][][][][][][ Item  ][][][][][][][][][][][]
                Box (
                    modifier = Modifier
                        .fillMaxWidth(0.4f)
//                    .border(1.dp, Color.Black)
                ) {
                    Text(
                        "Quantity",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color =  Color(0xFF681106)
                        ),
                        modifier = Modifier 
                            .offset(y = 25.dp)
                    )
                }

//  [][][][][][][][][][ Item Type ][][][][][][][][][][][]
                Box (
                    contentAlignment = Alignment.TopEnd,
                    modifier = Modifier
                        .fillMaxWidth()
//                        .border(1.dp, Color.Green)
                ) {

                    OutlinedTextField(value = quantity, onValueChange = {quantity},
                        label = {
                            Text(
                                "Add Quantity",
                                style = TextStyle(
                                    color = Color(0xFF8F8E8E)
                                )
                            )
                        },

                        modifier = Modifier
                            .width(150.dp)
//                            .height(50.dp)
                        )
                }


            }

            Spacer(modifier = Modifier.height(20.dp))

//            [][][][][][][][][][][][][ Quantity ][][][][]
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 22.dp, end = 22.dp)
//                    .border(1.dp, Color.Red)
            ){
                //  [][][][][][][][][][ Item  ][][][][][][][][][][][]
                Box (
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
//                    .border(1.dp, Color.Black)
                ) {
                    Text(
                        "pickup for me + N150",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color =  Color(0xFF681106)
                        ),
                        modifier = Modifier
                            .offset(y =10.dp)
                    )
                }

//  [][][][][][][][][][ Item Type ][][][][][][][][][][][]
                Box (
                    contentAlignment = Alignment.TopEnd,
                    modifier = Modifier
                        .fillMaxWidth()
//                        .border(1.dp, Color.Green)
                ) {

//                  Checkbox(checked = , onCheckedChange = )


                }


            }

            Box(

                contentAlignment = Alignment.BottomCenter,
                modifier = Modifier
                    .fillMaxWidth()
//                    .fillMaxHeight()
            ) {
                Button(
                    onClick = { /*TODO*/ },

                    modifier = Modifier
                        .width(190.dp)
                        .offset(y = 68.dp)
                        .background(Color(0xffffda05)),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Unspecified
                    )
                ) {
                    Text(
                        text = "Continue",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                        ),

                        )
                }
            }
        }
    }
}