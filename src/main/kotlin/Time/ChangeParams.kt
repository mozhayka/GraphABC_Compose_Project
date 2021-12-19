package Time

import Figures.*
import androidx.compose.runtime.*
import kotlinx.coroutines.delay
import nonComposableMain

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






