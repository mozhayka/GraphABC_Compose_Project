package Figures

import ListOfFigures.ListOfFigures
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

data class Rect (var color: Color,
            var topLeft_x: Float,
            var topLeft_y: Float,
            var size: Size
) : Figure {

    init {
        ListOfFigures.Add(this)
    }

    override fun getName(): String {
        return "Rect"
    }

//    fun draw() : (Rect) -> Unit
//    {
//        return DrawRect
//    }

}

@Composable
fun DrawRect(r: Rect)
{
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawRect(r.color, topLeft = Offset(r.topLeft_x, r.topLeft_y), size = r.size)
    }
}