package com.example.comosearticleemmanuel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.comosearticleemmanuel.ui.theme.ComoseArticleEmmanuelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComoseArticleEmmanuelTheme {
                ComposeArticleEmanuel()
            }
        }
    }
}

@Composable
fun ComposeArticleEmanuel(){
    Column (modifier = Modifier
        ){
        Column(modifier = Modifier
            .fillMaxWidth()
          //  .height(140.dp)


        )
        {

            Image(painter = painterResource(id = R.drawable.bg_compose_background),
                contentDescription = null )


        }
        //Spacer(modifier = Modifier.height(200.dp))
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding( start = 10.dp)

        )
        {

            Text(text = "Jetpack Compose tutorial",
                fontSize = 28.sp,
                color = Color.Black
            )

        }
        Column (

            modifier = Modifier
                .padding(top = 40.dp, start = 15.dp, end = 7.dp)){

            Text(text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                textAlign = TextAlign.Justify,
                color = Color.Black,
                fontSize = 15.sp)
        }


        Column (

            modifier = Modifier
                .padding(top = 40.dp, start = 15.dp, end = 7.dp)
                .fillMaxSize()){

            Text(text = " In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
                textAlign = TextAlign.Justify,
                color = Color.Black,
                fontSize = 15.sp)

        }

    }
}


@Preview(showBackground = true)
@Composable
fun ComposeArticleEmanuelPreview() {
    ComoseArticleEmmanuelTheme {
        ComposeArticleEmanuel()
    }
}