//package utilities
//
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Favorite
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Person
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material.icons.filled.ShoppingCart
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
//import androidx.compose.runtime.*
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.unit.dp
//
//@Composable
//fun BottomNavigationApp() {
//    val items = listOf(
//        BottomNavItem("Tab 1", Icons.Default.Home),
//        BottomNavItem("Tab 2", Icons.Default.Search),
//        BottomNavItem("Tab 3", Icons.Default.Favorite),
//        BottomNavItem("Tab 4", Icons.Default.ShoppingCart),
//        BottomNavItem("Tab 5", Icons.Default.Person)
//    )
//
//    var selectedTabIndex by remember { mutableStateOf(0) }
//
//    Scaffold(
//        bottomBar = {
//            BottomNavigation(
//                backgroundColor = MaterialTheme.colors.primary
//            ) {
//                items.forEachIndexed { index, item ->
//                    BottomNavigationItem(
//                        icon = {
//                            Icon(
//                                imageVector = item.icon,
//                                contentDescription = item.label
//                            )
//                        },
//                        label = { Text(text = item.label) },
//                        selected = selectedTabIndex == index,
//                        onClick = { selectedTabIndex = index },
//                        modifier = Modifier.padding(8.dp),
//                        alwaysShowLabel = false,
//                        selectedContentColor = Color.White,
//                        unselectedContentColor = Color.Gray
//                    )
//                }
//            }
//        }
//    ) { innerPadding ->
//        // Content area
//    }
//}
//
//data class BottomNavItem(val label: String, val icon: ImageVector)
