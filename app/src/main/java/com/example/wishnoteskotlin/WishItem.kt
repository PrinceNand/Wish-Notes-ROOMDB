package com.example.wishnoteskotlin

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.wishnoteskotlin.data.Wish


@Composable
fun WishItem(wish: Wish, onClick: () -> Unit) {

    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp, 8.dp, 8.dp, 0.dp)
            .clickable {
                onClick()
            }, elevation = 10.dp,
        backgroundColor = Color.White
    ) {
        Column(Modifier.padding(16.dp)) {
          Text(text = wish.title, fontWeight = FontWeight.ExtraBold)
            Text(wish.title, fontWeight = FontWeight.ExtraBold)
        }
    }
}