package ListOfFigures

import Figures.*
import Time.Timer
import androidx.compose.runtime.*
import kotlinx.coroutines.delay

class ListOfChanges
{
    companion object
    {
        var l = mutableMapOf<Figure, MutableList<Pair<DrawableFigure, Long>>>()

        fun add(a : Figure, f : DrawableFigure)
        {
            if(a !in l)
                l[a] = ArrayList()
            l[a]?.add(Pair(f, Timer.delay))
        }
    }
}


@Composable
fun drawAll()
{
    val keys = ListOfChanges.l.values
    keys.forEach {
        var d by remember { mutableStateOf(it[0].first) }
        var exists by remember { mutableStateOf(false) }
        var curDelay = 0L

        if (exists)
            Draw(d)

        LaunchedEffect(true) {

            it.forEach {
                delay(it.second - curDelay)
                curDelay = it.second
                d = it.first
                if (!exists)
                    exists = true
            }
        }
    }
}
