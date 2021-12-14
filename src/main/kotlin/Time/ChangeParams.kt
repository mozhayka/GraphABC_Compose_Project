package Time

import Figures.Figure
import ListOfFigures.ListOfFigures
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay

class ListOfChanges {
    companion object{
        var l = arrayListOf<Pair<Circle3, Long>>()

        fun Add(f : Circle3, delay : Long)
        {
            l.add(Pair(f, delay))
        }
    }
}


data class Circle2(var color: Color,
                  var x: Float,
                  var y: Float,
                  var r: Float )
{
    companion object
    {
        var delay : Long = 0
    }

    fun save()
    {
        ListOfChanges.Add(Circle3(color, x, y, r), delay)
    }

    init
    {
        save()
    }

    fun ChangeR(newR : Float)
    {
        r = newR
        save()
    }

    fun ChangeX(newX : Float)
    {
        x = newX
        save()
    }

    fun ChangeColor(newColor : Color)
    {
        color = newColor
        save()
    }
}


@Composable
fun DrawCircleWithChangedParams()
{
    var c by remember { mutableStateOf(ListOfChanges.l[0].first)}
    DrawCircle3(c)
    var cur_delay = 0L

    LaunchedEffect(true) {
        ListOfChanges.l.forEach {
            delay(it.second - cur_delay)
            cur_delay = it.second
            c = it.first
        }

    }
}

@Composable
fun drawC()
{
    nonComp()
    DrawCircleWithChangedParams()
}

fun Wait(time : Long)
{
    Circle2.delay += time
}

fun nonComp()
{
    val c = Circle2(Color.Blue, 100f, 100f, 10f)
    Wait(1000L)

    c.ChangeR(c.r + 10f)
    Wait(1000L)

    c.ChangeX(200f)
    Wait(2000L)

    c.ChangeColor(Color.Cyan)
    c.ChangeR(100f)
}