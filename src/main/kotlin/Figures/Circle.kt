package Figures

import ListOfFigures.ListOfChanges
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

data class Circle(var color1: Color, var x1: Float, var y1: Float, var r1: Float ) : Figure
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

    override fun save()
    {
        ListOfChanges.add(this, DrawableCircle(color, x, y, r))
    }

    init
    {
        save()
    }

}

class DrawableCircle(var color: Color, var x: Float, var y: Float, var r: Float ) : DrawableFigure
{
    override fun getName(): String {
        return "Circle"
    }
}

@Composable
fun drawCircle(c : DrawableCircle)
{
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(color = c.color, center = Offset(c.x, c.y), radius = c.r)
    }
}
