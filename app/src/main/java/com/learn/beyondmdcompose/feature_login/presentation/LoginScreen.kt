package com.learn.beyondmdcompose.feature_login.presentation

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learn.beyondmdcompose.R

@Composable
fun LoginScreen(){

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.ic_login_screen),
            contentDescription = stringResource(id = R.string.cd_login),
            modifier = Modifier
                .size(200.dp)
        )

        Text(text = "Hi, Welcome back", color = Color.Black,)
    }



}

@Preview
@Composable
fun PreviewLoginScreen(){
    Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
        LoginScreen()
    }
}



