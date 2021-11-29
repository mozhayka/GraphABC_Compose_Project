package ListOfFigures

import Figures.Circle
import Figures.DrawCircle
import Figures.Figure
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
            "DrawCircle" -> DrawCircle(it as Circle)
        }
    }
}