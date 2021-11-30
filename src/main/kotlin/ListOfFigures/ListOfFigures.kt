package ListOfFigures

import Figures.*
import androidx.compose.runtime.Composable

class ListOfFigures {
    companion object{
        var l = arrayListOf<Figure>()

        fun Add(f : Figure)
        {
            l.add(f)
        }
    }
}


@Composable
fun DrawAll()
{
    ListOfFigures.l.forEach{
        when(it.getName())
        {
            "Circle" -> DrawCircle(it as Circle)
            "Rect" -> DrawRect(it as Rect)
        }
    }
}