package com.haneetarya.ytphllipe

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.haneetarya.ytphllipe.ui.theme.YTPhllipeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // Video 1
//            Column(
//                modifier = Modifier
//                    .background(Color.Magenta)
//                    .fillMaxSize()
//                ,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.SpaceEvenly
//            ){
//                Text(text = "Hello")
//                Text(text = "World")
//                Text(text = "How are You")
////            }
//            Row(
//                modifier = Modifier
//                    .background(Color.Magenta)
//                    .fillMaxWidth()
//                    .fillMaxHeight(0.8f)
//                ,
//                horizontalArrangement = Arrangement.SpaceAround,
//                verticalAlignment = Alignment.CenterVertically
//            ){
//                Text(text = "Hello")
//                Text(text = "World")
//                Text(text = "How are You")
//            }


            // Video 2
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
//                    .width(600.dp) // 600 dp is bigger than screen but it still reduces to screen size
//                    .requiredWidth(600.dp) // it pushed away the view outside screen size and it will
                    // show only mid view
                    // below function are executed sequentially and below the particular will behave after
                    //applying the first one
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                    .border(5.dp, Color.Blue)
                    .padding(5.dp)
                    .border(10.dp, Color.Red)
                    .padding(10.dp)

            ) {
                Text(
                    text = "Hello",
                    modifier = Modifier
//                        .border(5.dp, Color.Yellow)
//                        .padding(5.dp)
//                        .offset(20.dp, 20.dp)
//                        .border(10.dp, Color.Black)
//                        .padding(10.dp)
                        .clickable {
                            Toast.makeText(applicationContext, "Text Clicked", Toast.LENGTH_LONG).show()
                        }
                )
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "World!!")
            }

        }
    }
}

