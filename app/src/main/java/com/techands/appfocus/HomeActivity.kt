package com.techands.appfocus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.techands.appfocus.ui.theme.AppFocusTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppFocusTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    MainText()
                }
            }
        }
    }
}

@Composable
fun MainText() {
    Text(text = "Welcome to Jetpack Compose Learning Series")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    AppFocusTheme {
        MainText()
    }
}