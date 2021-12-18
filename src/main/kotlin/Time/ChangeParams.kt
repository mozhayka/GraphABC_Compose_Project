package Time

import Figures.Figure
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay

class Timer
{
    companion object
    {
        var delay : Long = 0

        fun Wait(time : Long)
        {
            delay += time
        }
    }
}

class ListOfChanges
{
    companion object
    {
        var l = mutableMapOf<Figure, MutableList<Pair<Circle3, Long>>>()

        fun Add(a : Figure, f : Circle3)
        {
            if(a !in l)
                l[a] = ArrayList()
            l[a]?.add(Pair(f, Timer.delay))
        }
    }
}


data class Circle2(var color1: Color, var x1: Float, var y1: Float, var r1: Float ) : Figure
{
    var color = color1
        set(value) {
            field = value
            save()
        }

    var x = x1
        set(value) {
            field = value
            save()
        }

    var y = y1
        set(value) {
            field = value
            save()
        }

    var r = r1
        set(value) {
            field = value
            save()
        }

    fun save()
    {
        ListOfChanges.Add(this, Circle3(color, x, y, r))
    }

    init
    {
        save()
    }

    override fun getName(): String {
        return "Circle"
    }
}


@Composable
fun DrawCircleWithChangedParams()
{
    var keys = ListOfChanges.l.values
    keys.forEach {
        var d by remember { mutableStateOf(it[0].first) }
        DrawCircle3(d)
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

    c.r += 10f
    Timer.Wait(1000L)

    c.x = 200f
    Timer.Wait(1000L)

    c.r = 100f
    c.y = 130f
    c.color = Color.Black
}
