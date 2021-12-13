package Time

import DrawFiguresFunctions.DrawCircle
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay

@Composable
fun ChangeParamsAfterDelay()
{
    var rad by remember { mutableStateOf(50f) }
    var x by remember { mutableStateOf(100.5f) }
    var y by remember { mutableStateOf(120f) }
    var color by remember { mutableStateOf(Color.Blue) }
    DrawCircle(color, x, y, rad)
    LaunchedEffect(true) {
        delay(1000L)
        rad += 10f

        delay(1000L)
        color = Color.Red

        delay(1000L)
        y += 100f
        x += 100f
    }
//    LaunchedEffect(true) {
//        delay(3000L)
//        println("delay")
//        rad += 10f
//        println(rad)
//        delay(3000L)
//        color = Color.Green
//        y += 10f
//
//    }

}