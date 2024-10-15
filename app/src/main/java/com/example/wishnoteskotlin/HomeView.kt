package com.example.wishnoteskotlin

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.wishnoteskotlin.data.DummyWish

@Composable
fun HomeView(viewModel: WishViewModel, navController: NavController){
    val context = LocalContext.current
    Scaffold(topBar = { AppBarView(title = "Wish Item", onBackClicked = {
        Toast.makeText(context, "Button Clicked", Toast.LENGTH_LONG).show()
    },
        ) },
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier.padding(all = 20.dp),
                contentColor = Color.White,
                backgroundColor = Color.Black,
                onClick = {
                    Toast.makeText(context, "FAButton Clicked", Toast.LENGTH_LONG).show()
                    // TODO Add Navigation to add screen
                    navController.navigate(Screen.AddScreen.route)
                }
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }) {
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(it)) {
            items(DummyWish.wishList){
                wish ->  WishItem(wish = wish) { }
            }
        }
    }
}