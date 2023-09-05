package com.haneetarya.ytphllipe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.haneetarya.ytphllipe.ui.theme.YTPhllipeTheme
import kotlin.random.Random

class StateControl : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val color = remember{
                mutableStateOf(Color.Yellow)
            }
            Column {
                ColorBox(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                ) {
                    color.value = it
                }

                Box(modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(color = color.value))

            }
        }
    }
}

@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
) {
    Box(
        modifier = modifier
            .background(color = Color.Red)
            .clickable {
                updateColor(
                    Color(
                        Random.nextInt(0, 255),
                        Random.nextInt(0, 255),
                        Random.nextInt(0, 255),
                        alpha = 0xFF
                    )
                )
            }
    )
}
