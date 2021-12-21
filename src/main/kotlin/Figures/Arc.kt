package Figures

import ListOfFigures.ListOfChanges
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

data class Arc(var color1: Color, var startAngle1: Float, var sweepAngle1: Float, var r1: Float ) : Figure
{
    var color = color1
        set(value) {
            field = value
            save()
        }

    var startAngle = startAngle1
        set(value) {
            field = value
            save()
        }

    var sweepAngle = sweepAngle1
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
        ListOfChanges.add(this, DrawableArc(color, startAngle, sweepAngle, r))
    }

    init
    {
        save()
    }

}

class DrawableArc(var color: Color, var startAngle: Float, var sweepAngle: Float, var r: Float ) : DrawableFigure
{
    override fun getName(): String {
        return "Arc"
    }
}

@Composable
fun drawArc(c : DrawableArc)
{
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawArc(color = c.color, c.startAngle, c.sweepAngle, useCenter = true, size = Size(c.r, c.r))
    }
}