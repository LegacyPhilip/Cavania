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
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.cavania.R
import utilities.Wearables
@Composable
fun DescriptiveDetail(navController: NavController){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffffffff))
    ){
        item(1){
            Wearables().HeadingSection()

//    [][][][][][][][][][][][][]][[ List of offers ]][][][][][][][][][][][][]

            Text(
                "Our Menu",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(22.dp)
            )


// ][][][][][][][][][][][][][][ Descriptive Detail ][][][][][][][][][][]

            Wearables().DescDetail()
            Spacer(modifier = Modifier.height(20.dp))
            Wearables().DescDetail()
            Spacer(modifier = Modifier.height(20.dp))
            Wearables().DescDetail()
            Spacer(modifier = Modifier.height(20.dp))
            Wearables().DescDetail()
            Spacer(modifier = Modifier.height(20.dp))
            Wearables().DescDetail()
            Spacer(modifier = Modifier.height(20.dp))
            Wearables().DescDetail()
            Spacer(modifier = Modifier.height(20.dp))
            Wearables().DescDetail()
            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}