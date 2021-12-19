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

        fun Add(a : Figure, f : DrawableFigure)
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
        if (exists)
            Draw(d)
        var curDelay = 0L

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


//class ListOfFigures {
//    companion object{
//        var l = arrayListOf<Figure>()
//
//        fun Add(f : Figure)
//        {
//            l.add(f)
//        }
//    }
//}
//
//
//@Composable
//fun DrawAll()
//{
//    ListOfFigures.l.forEach{
//        when(it.getName())
//        {
//            "Circle" -> DrawCircle(it as Circle)
//            "Rect" -> DrawRect(it as Rect)
//        }
//
//        Executors.newSingleThreadScheduledExecutor().schedule({
//            println("swap param")
//            if (it.getName() == "Circle")
//                (it as Circle).r = 100.0f
//        }, 5, TimeUnit.SECONDS)
//    }
//}