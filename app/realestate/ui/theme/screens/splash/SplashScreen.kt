package com.example.realestate.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.realestate.R
import com.example.realestate.navigation.ROUT_HOME
import com.example.realestate.navigation.ROUT_LOGIN
import com.example.realestate.ui.theme.brown
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.reflect.Modifier

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){
    Column(modifier = androidx.compose.ui.Modifier
        .fillMaxSize()
        .background(brown),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var coroutineScope = rememberCoroutineScope()
        coroutineScope.launch {
            delay(2000)
            navController.navigate(ROUT_LOGIN)
        }


        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.property))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = androidx.compose.ui.Modifier.size(300.dp)
        )












    }


}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())

}
