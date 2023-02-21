package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
              

                        text()


            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun text() {
    Surface(
        shadowElevation = 1.dp,
        color = androidx.compose.ui.graphics.Color.LightGray,
        modifier = Modifier.animateContentSize().padding(5.dp).fillMaxWidth()
    ){
        Row(modifier = Modifier.padding(5.dp)) {
            Image(
                painter = painterResource(id = R.drawable.man),
                contentDescription = "test",
                modifier = Modifier
                    .size(50.dp)
            )

            Column(
                modifier = Modifier.padding(5.dp)
            ) {
                Greeting("Android")
                Text(text = "burak baba")
            }
        }

    }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        ComposeTheme {
          text()

        }
        }
