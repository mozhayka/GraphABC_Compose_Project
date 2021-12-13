package Time

import Figures.Circle
import ListOfFigures.DrawAll
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import kotlinx.coroutines.Delay
import kotlinx.coroutines.delay
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

//fun Wait()
//{
//    Thread.sleep(5000L)
//    DrawAll()
//}

@Composable
fun DrawCircle1(color: Color, center_x: Float, center_y: Float, r: Float)
{
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(color, center = Offset(center_x, center_y), radius = r)
    }
}


@Composable
fun DrawDelay()
{
    var rad by remember { mutableStateOf(50f) }
    var y by remember { mutableStateOf(120f) }
    var color by remember { mutableStateOf(Color.Blue) }
    DrawCircle1(color, 100.5f, y, r = rad)
    LaunchedEffect(true) {
        delay(3000L)
        println("delay")
        rad += 10f
        println(rad)
        color = Color.Red
        y += 10f

    }


}