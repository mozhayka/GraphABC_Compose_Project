package ComposeExamples

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay


data class CircleExample(var color: Color,
                         var x: Float,
                         var y: Float,
                         var r: Float )

@Composable
fun drawCircle(c : CircleExample)
{
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(color = c.color, center = Offset(c.x, c.y), radius = c.r)
    }
}

@Composable
fun changeParams(c2 : CircleExample)
{
    var c by remember { mutableStateOf(c2)}
    drawCircle(c)

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
fun drawExampleWithDelay2()
{
    changeParams(CircleExample(Color.Blue, 100f, 100f, 10f))
}