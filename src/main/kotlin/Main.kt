// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import DrawFiguresFunctions.CanvasDrawExample
import Figures.Circle
import DrawFiguresFunctions.DrawCircle
import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.singleWindowApplication

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    DesktopMaterialTheme {
        Button(onClick = {
            text = "Hello, Desktop!"
        }) {
            Text(text)
        }
    }
}



fun main() = singleWindowApplication(
//    title = "Falling Balls", state = WindowState(size = DpSize(800.dp, 800.dp))
)
{
    CanvasDrawExample()
    DrawCircle(color = Color.Blue, center_x = 100.5f, center_y = 120.7f, r = 40f)
//    val c = Circle()
}

//fun main() = application {
//    Window(onCloseRequest = ::exitApplication) {
//
//        DrawCircle(color = Color.Blue, center_x = 100.5f, center_y = 120.7f, r = 40f)
//        DrawCircle(color = Color.Red, center_x = 80.5f, center_y = 120f, r = 30f)
//        CanvasDrawExample()
////        App()
//    }
//}
