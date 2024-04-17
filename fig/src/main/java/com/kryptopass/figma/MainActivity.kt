package com.kryptopass.figma

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kryptopass.figma.data.posts
import com.kryptopass.figma.ui.home.HomeScreen
import com.kryptopass.figma.ui.theme.LearnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.setBackgroundColor(Color.parseColor("#2D3946"));
        setContent {
            LearnTheme {
                HomeScreen(posts)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTheme {
        HomeScreen(posts)
    }
}