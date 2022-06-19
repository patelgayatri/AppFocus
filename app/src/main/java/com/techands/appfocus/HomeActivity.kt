package com.techands.appfocus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.techands.appfocus.ui.theme.AppFocusTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppFocusTheme {
                // A surface container using the 'background' color from the theme
                DesignHomeScreen()
            }
        }
    }
}
    @Composable
    private fun DesignHomeScreen() {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 16.dp, top = 16.dp),
                verticalArrangement = Arrangement.Top,

            ) {
                val context = LocalContext.current
                DisplayImage()
                HeaderText("Hello Everyone")
                BodyText("Here's is an Update")
                HeaderText("Inbox")
                BodyText("Unread message")
                MyButton(context,"Want to know more")
            }
        }
    }


@Composable
fun HeaderText(name: String) {
    Text(text = name, fontSize = 24.sp, color = Color.Red, modifier = Modifier.padding(top = 16.dp))
}
@Composable
fun BodyText(name: String) {
    Text(text = name, color = Color.Gray)
}
@Composable
fun DisplayImage(){
    val image: Painter = painterResource(id = R.drawable.smiley)
    Image(painter = image, contentDescription = "image")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    AppFocusTheme {
        DesignHomeScreen()
    }
}