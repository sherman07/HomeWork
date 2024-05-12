package com.example.box

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ImageBox(image: Int, modifier: Modifier){

    Box(modifier = Modifier){

        Image(painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
            )
    }
}

///Homework:
//Design a screen using composable,   Image, text,  box …
@Preview(showBackground = true)
@Composable
fun PreviewImageBox(){
    Column(modifier = Modifier.fillMaxSize(),
        ) {

        ImageBox(image = R.drawable.image001, modifier = Modifier.size(100.dp))
        ImageBox(image = R.drawable.ic_launcher_foreground, modifier = Modifier.size(400.dp))
    }
}