package Figures

import ListOfFigures.ListOfChanges
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

data class Arc(var color1: Color,
               var startAngle1: Float,
               var sweepAngle1: Float,
               var r1: Float,
               var topLeftx_ : Float,
               var topLefty_ : Float) : Figure
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

    var topLeftx = topLeftx_
        set(value) {
            field = value
            save()
        }

    var topLefty = topLefty_
        set(value) {
            field = value
            save()
        }

    override fun save()
    {
        ListOfChanges.add(this, DrawableArc(color, startAngle, sweepAngle, r, topLeftx_, topLefty_))
    }

    init
    {
        save()
    }

}

class DrawableArc(var color: Color,
                  var startAngle: Float,
                  var sweepAngle: Float,
                  var r: Float,
                  var topLeftx : Float,
                  var topLefty : Float) : DrawableFigure
{
    override fun getName(): String {
        return "Arc"
    }
}

@Composable
fun drawArc(c : DrawableArc)
{
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawArc(color = c.color, c.startAngle, c.sweepAngle, useCenter = true, size = Size(c.r, c.r), topLeft = Offset(c.topLeftx, c.topLefty))
    }
}
