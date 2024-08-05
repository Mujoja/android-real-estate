package com.example.realestate.ui.theme.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.ui.theme.brown

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize()) {

        TopAppBar(
            title = {Text(text = "MagicBricks", fontFamily = FontFamily.Cursive, color = Color.LightGray)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(brown),
            navigationIcon ={
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "", tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "")
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "")
                }

            }
            )

        Box (modifier = Modifier
            .fillMaxWidth()
            .height(280.dp),
            contentAlignment = Alignment.Center){

            Image(painter = painterResource(id = R.drawable.home), contentDescription ="home" ,
                modifier = Modifier.fillMaxSize())
            Text(text = "Choose Your Best Property",
                fontSize = 40.sp,
                color = Color.Cyan,
                fontFamily = FontFamily.Monospace
            )
        }





        }


    }



@Composable
@Preview(showBackground = true)
fun DetailScreenPreview(){
    DetailScreen(rememberNavController())
}
