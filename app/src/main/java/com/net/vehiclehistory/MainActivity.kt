package com.net.vehiclehistory

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.net.vehiclehistory.ui.theme.VehicleHistoryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VehicleHistoryTheme {
                MainPage()
            }
        }
    }
}

@Composable
fun MainPage() {
    ConstraintLayout(
        modifier = Modifier.fillMaxHeight().fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .padding(start = 50.dp, bottom = 50.dp)
                .size(100.dp)
                .background(Color.Green)
        )
    }

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    VehicleHistoryTheme {
        Greeting("Android")
    }
}