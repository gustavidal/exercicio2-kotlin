package com.example.spaceinvaders

import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spaceinvaders.ui.theme.SpaceInvadersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SpaceInvadersTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    BasicComponentScreen(
//                        modifier = Modifier
//                            .padding(innerPadding)
//                    )
                    GameOverScreen(
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicComponentScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column() {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp, 50.dp, 5.dp, 15.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "SCORE: 0050",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )


                Row (
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "LIVES: ",
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White,
                        modifier = Modifier
                            .padding(5.dp, 0.dp)
                    )
                    LifeHeart(
                        modifier = Modifier
                            .size(25.dp)
                    )
                    LifeHeart(
                        modifier = Modifier
                            .size(25.dp)
                    )
                    LifeHeart(
                        modifier = Modifier
                            .size(25.dp)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp, 0.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                AndroidEnemy(
                    modifier = Modifier
                        .size(70.dp),
                    color = Color.Green
                )
                AndroidEnemy(
                    modifier = Modifier
                        .size(70.dp),
                    color = Color.Red
                )
                AndroidEnemy(
                    modifier = Modifier
                        .size(70.dp),
                    color = Color.Blue
                )
                AndroidEnemy(
                    modifier = Modifier
                        .size(70.dp),
                    color = Color.Yellow
                )
                AndroidEnemy(
                    modifier = Modifier
                        .size(70.dp),
                    color = Color.Magenta
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .size(100.dp),
                painter = painterResource(R.drawable.cube),
                contentDescription = "Colored Cube"
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .background(Color.DarkGray),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "PRESS START",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun GameOverScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp, 0.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            AndroidEnemy(
                modifier = Modifier
                    .size(70.dp),
                color = Color.Green
            )
            AndroidEnemy(
                modifier = Modifier
                    .size(70.dp),
                color = Color.Red
            )
            AndroidEnemy(
                modifier = Modifier
                    .size(70.dp),
                color = Color.Blue
            )
            AndroidEnemy(
                modifier = Modifier
                    .size(70.dp),
                color = Color.Yellow
            )
            AndroidEnemy(
                modifier = Modifier
                    .size(70.dp),
                color = Color.Magenta
            )
        }
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "GAME OVER",
            fontSize = 70.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun LifeHeart(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.life_heart),
        contentDescription = "LifeHeart"
    )
}

@Composable
fun AndroidEnemy(
    modifier: Modifier = Modifier,
    color: Color
) {
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.ic_android_robot),
        colorFilter = ColorFilter.tint(color),
        contentDescription = "Android Enemy"
    )
}