package Figures

//import ListOfFigures.ListOfFigures
import ListOfFigures.ListOfChanges
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

data class Rect (var color1 : Color,
            var topLeft_x : Float,
            var topLeft_y : Float,
            var size1 : Size) : Figure
{
    var color = color1
        set(value) {
            field = value
            save()
        }

    var x = topLeft_x
        set(value) {
            field = value
            save()
        }

    var y = topLeft_y
        set(value) {
            field = value
            save()
        }

    var size = size1
        set(value) {
            field = value
            save()
        }

    fun save()
    {
        ListOfChanges.add(this, DrawableRect(color, x, y, size))
    }

    init
    {
        save()
    }

}

class DrawableRect(var color: Color, var topLeft_x: Float, var topLeft_y: Float, var size : Size ) : DrawableFigure
{
    override fun getName(): String {
        return "Rect"
    }
}

@Composable
fun drawRect(r : DrawableRect)
{
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawRect(r.color, topLeft = Offset(r.topLeft_x, r.topLeft_y), size = r.size)
    }
}
