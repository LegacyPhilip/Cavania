package packs

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
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cavania.R
import utilities.Wearables

@Composable
fun BeanchMark(){

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffffffff))
    ){
        item ( 1) {
            Wearables().HeadingSection()

//    [][][][][][][][][][][][][]][[ List of offers ]][][][][][][][][][][][][]

            Text(
                "Available Listing",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(22.dp)
            )

//            [][][][][][][]][][][][][][ Available listing ][][][][][][][][][][][][]

            Wearables().ListingDetails()
            Spacer(modifier = Modifier.height(30.dp))
            Wearables().ListingDetails()
            Spacer(modifier = Modifier.height(30.dp))
            Wearables().ListingDetails()
            Spacer(modifier = Modifier.height(30.dp))
            Wearables().ListingDetails()
            Spacer(modifier = Modifier.height(30.dp))
            Wearables().ListingDetails()
            Spacer(modifier = Modifier.height(30.dp))
            Wearables().ListingDetails()
            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}