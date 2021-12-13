package Time

import Figures.Circle
import Figures.DrawCircle
import Figures.Figure
import ListOfFigures.ListOfFigures
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import kotlinx.coroutines.delay
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

data class Circle2(var color: Color,
                  var center_x: Float,
                  var center_y: Float,
                  var r: Float, )

@Composable
fun DrawCircle2(c : Circle2)
{
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(color = c.color, center = Offset(c.center_x, c.center_y), radius = c.r)
    }
}


@Composable
fun DrCir()
{
    var c by remember { mutableStateOf(Circle2(Color.Blue, 10f, 10f, 10f))}
    DrawCircle2(c)
    LaunchedEffect(true) {
        delay(3000L)
//        currentOnTimeout()
    }
    Executors.newSingleThreadScheduledExecutor().schedule({
        c.r += 10f
        val d = c.copy()
        c = d
    }, 6, TimeUnit.SECONDS)
}

