package Figures

import ListOfFigures.ListOfFigures
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.text.font.FontSynthesis.Companion.Style

data class Circle(var color: Color,
                  var center_x: Float,
                  var center_y: Float,
                  var r: Float,
                  var fill: Boolean = true) : Figure{

    init {
        ListOfFigures.Add(this)
    }

    override fun getName(): String {
        return "Circle"
    }

//    fun draw() : (Circle) -> Unit
//    {
//        return DrawCircle
//    }

}

@Composable
fun DrawCircle(c : Circle)
{
    var paint = Paint()
    paint.color = c.color
    paint.style = PaintingStyle.Fill


//    paint.setColor(c.color
//    paint.setStyle(Paint.Style.FILL)
    Canvas(modifier = Modifier.fillMaxSize()) {
//        drawCircle(c.center_x, c.center_y, c.r, paint)
        drawCircle(color = c.color, center = Offset(c.center_x, c.center_y), radius = c.r)//, style = DrawStyle)
//        drawCircle()
    }
}