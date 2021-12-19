package Time

import Figures.Circle2
import Figures.DrawableCircle
import Figures.DrawableFigure
import Figures.Figure
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay

class ListOfChanges
{
    companion object
    {
        var l = mutableMapOf<Figure, MutableList<Pair<DrawableFigure, Long>>>()

        fun Add(a : Figure, f : DrawableFigure)
        {
            if(a !in l)
                l[a] = ArrayList()
            l[a]?.add(Pair(f, Timer.delay))
        }
    }
}

@Composable
fun DrawCircle(c : DrawableCircle)
{
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(color = c.color, center = Offset(c.x, c.y), radius = c.r)
    }
}

@Composable
fun Draw(f : DrawableFigure)
{
    when(f.getName())
        {
            "Circle" -> DrawCircle(f as DrawableCircle)
//            "Rect" -> DrawRect(f as Rect)
        }
}


@Composable
fun DrawCircleWithChangedParams()
{
    var keys = ListOfChanges.l.values
    keys.forEach {
        var d by remember { mutableStateOf(it[0].first) }
        Draw(d)
        var cur_delay = 0L

        LaunchedEffect(true) {
            it.forEach {
                delay(it.second - cur_delay)
                cur_delay = it.second
                d = it.first
            }

        }
    }
}

@Composable
fun drawC()
{
    nonComp()

    DrawCircleWithChangedParams()
}



fun nonComp()
{
    val c = Circle2(Color.Blue, 100f, 100f, 10f)
    Timer.Wait(1000L)

    val c2 = Circle2(Color.Green, 300f, 300f, 40f)
    c.r += 10f
    Timer.Wait(500L)

    c2.r += 10f
    Timer.Wait(500L)

    c.x = 200f
    Timer.Wait(1000L)

    c.r = 100f
    c.y = 130f
    c.color = Color.Black
}
