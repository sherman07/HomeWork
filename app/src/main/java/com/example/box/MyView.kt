package com.example.box

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.box.ui.theme.BoxTheme

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column {
        Spacer(modifier = Modifier.padding(16.dp))
        Card()

    }
}

@Composable
fun Card(){
    Box(
        modifier = Modifier
            .height(300.dp)
            .fillMaxWidth()
            .padding(16.dp)
            .background(
                shape = RoundedCornerShape(20.dp),
                color = Color.LightGray
            )
            .padding(16.dp),
        contentAlignment = Alignment.Center
    )
    {

        Text(
            text = "Hello Sherman!"
            )
        Text(
            text = "Hello !",
            modifier = Modifier.align(Alignment.TopStart)
        )
        Text(
            text = "Goodbye !",
            modifier = Modifier.align(Alignment.TopEnd)
        )
        Text(
            text = "Hello !",
            modifier = Modifier.align(Alignment.TopCenter)
        )
        Text(
            text = "Goodbye !",
            modifier = Modifier.align(Alignment.BottomStart)
        )
        Text(
            text = "Hello !",
            modifier = Modifier.align(Alignment.BottomEnd)
        )
        Text(
            text = "Goodbye !",
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
    Box(modifier = Modifier
        .height(300.dp)
        .fillMaxWidth()
        .padding(16.dp)
        .background(
            shape = RoundedCornerShape(20.dp),
            color = Color.LightGray
        )
        .padding(16.dp),
        contentAlignment = Alignment.Center){

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null
        )

    }
}

@Composable
fun Image(modifier: Modifier = Modifier, painter: Any, contentDescription: Nothing?) {
    Image(
        painter = painterResource(R.drawable.image001),
        contentDescription = null
    )

}

///Homework:
//Create another Card,
//
//Add image in the center in the card.

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BoxTheme{
        Column (modifier = Modifier.fillMaxSize()){
            Greeting()
        }
    }
}