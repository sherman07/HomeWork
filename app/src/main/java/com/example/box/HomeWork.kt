package com.example.box

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyScreen() {
    Column {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column {
                MyScreenContent(image = R.drawable.image001,
                    modifier = Modifier.size(100.dp))
                MyScreenContent(image = R.drawable.image002,
                    modifier = Modifier.size(100.dp))
            }

        }
    }
}

@Composable
fun MyScreenContent(image: Int, modifier: Modifier) {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier){
        Text(text = "My Photo Work",
            modifier = Modifier.padding(16.dp),
            color = Color.White,
            fontSize = 45.sp)

        Image(painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
    }

}


@Preview
@Composable
fun MyScreenPreview() {
    MyScreen()
}