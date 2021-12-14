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
                  var x: Float,
                  var y: Float,
                  var r: Float )

@Composable
fun DrawCircle2(c : Circle2)
{
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(color = c.color, center = Offset(c.x, c.y), radius = c.r)
    }
}


@Composable
fun DrawCircleWithChangedParams(c2 : Circle2)
{
    var c by remember { mutableStateOf(c2)}
    DrawCircle2(c)

    LaunchedEffect(true) {
        delay(1000L)
        c = c.copy(x = c.x + 10f)

        delay(1000L)
        c = c.copy(r = c.r + 10f)

        delay(1000L)
        c = c.copy(color = Color.Green)
    }
}

@Composable
fun drawC()
{
    DrawCircleWithChangedParams(Circle2(Color.Blue, 100f, 100f, 10f))
}

