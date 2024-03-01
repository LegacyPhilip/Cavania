package utilities

sealed class Screen (val route: String){
    object MainView: Screen("HomeView")
    object HotLine1: Screen("homeScreen")
    object  HotLine2: Screen( "homeScreen2")
    object  Hotline3: Screen("homeScreen3")
    object CreateHome: Screen("AccountSign")
    object  Login:     Screen("LoginScreen")
    object  HotScreen: Screen("screenOne")
    object  ListDetail: Screen("BeanchMark")
    object  DescListing: Screen("DescriptiveDetail")
    object  OrderingSumarry: Screen("OrderSummary")
}
