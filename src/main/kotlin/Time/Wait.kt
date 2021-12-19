package Time

import DrawFiguresFunctions.DrawCircle
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay

@Composable
fun ChangeParamsAfterDelay()
{
    var rad by remember { mutableStateOf(50f) }
    var x by remember { mutableStateOf(100.5f) }
    var y by remember { mutableStateOf(120f) }
    var color by remember { mutableStateOf(Color.Blue) }
    var exists by remember { mutableStateOf(false) }

    if (exists)
        DrawCircle(color, x, y, rad)

    LaunchedEffect(true) {
        delay(3000L)
        exists = true

        delay(1000L)
        rad += 10f

        delay(1000L)
        color = Color.Red

        delay(1000L)
        y += 100f
        x += 100f
    }

}


data class Circle3(var color: Color,
                   var x: Float,
                   var y: Float,
                   var r: Float )

@Composable
fun DrawCircle3(c : Circle3)
{
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(color = c.color, center = Offset(c.x, c.y), radius = c.r)
    }
}


@Composable
fun DrawCircleWithChangedParams1(c2 : Circle3)
{
    var c by remember { mutableStateOf(c2)}
    DrawCircle3(c)

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
fun drawC1()
{
    DrawCircleWithChangedParams1(Circle3(Color.Blue, 100f, 100f, 10f))
}