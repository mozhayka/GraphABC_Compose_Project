package Figures

import ListOfFigures.ListOfChanges
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

data class Line(var color1: Color,
                var x1_: Float,
                var y1_: Float,
                var x2_: Float,
                var y2_: Float,
                var strokeWidth_ : Float ) : Figure
{
    var color = color1
        set(value) {
            field = value
            save()
        }

    var x1 = x1_
        set(value) {
            field = value
            save()
        }

    var y1 = y1_
        set(value) {
            field = value
            save()
        }

    var x2 = x2_
        set(value) {
            field = value
            save()
        }

    var y2 = y2_
        set(value) {
            field = value
            save()
        }

    var strokeWidth = strokeWidth_
        set(value) {
            field = value
            save()
        }

    fun save()
    {
        ListOfChanges.add(this, DrawableLine(color, x1, y1, x2, y2, strokeWidth))
    }

    init
    {
        save()
    }

}

class DrawableLine(var color: Color,
                  var x1: Float,
                  var y1: Float,
                  var x2: Float,
                  var y2: Float,
                  var strokeWidth : Float ) : DrawableFigure
{
    override fun getName(): String {
        return "Line"
    }
}

@Composable
fun drawLine(c : DrawableLine)
{
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawLine(color = c.color, Offset(c.x1, c.y1), Offset(c.x2, c.y2), c.strokeWidth)
    }
}