package com.example.mypokeapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.mypokeapp.ui.theme.MyPokeAppTheme


@Composable
fun Mainscreen(){
    //PokeCardLayout()
}

@Composable
fun PokeCard(
    imageURL: String,
    pokeName: String
){
    Column() {
        Image(
            painter = rememberAsyncImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(80.dp)
        )
        Text(
            text = pokeName
        )
    }
}
/*
@Composable
fun PokeCardLayout(){
    LazyHorizontalGrid(
        rows = GridCells.Fixed(3)
    ){
        items(){ item ->
            PokeCard()
        }
    }
}*/

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun PokeCardPreview(){
    MyPokeAppTheme {
        //PokeCardLayout()
    }
}