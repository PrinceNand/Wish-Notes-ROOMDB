package com.project.wishnotes

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.wishnoteskotlin.R

@Composable
fun AppBarView(
    title: String,
    onBackClicked: () -> Unit
) {
    TopAppBar(
        title = {
            Text(text = title,
                color = colorResource(id = R.color.white),
                modifier = androidx.compose.ui.Modifier
                    .padding(start = 4.dp)
                    .heightIn(max = 24.dp))
        },
        elevation = 3.dp,
        backgroundColor = colorResource(id = R.color.app_bar_color)
    )
}