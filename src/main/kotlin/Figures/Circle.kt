package Figures

import ListOfFigures.ListOfFigures
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

data class Circle(var color: Color,
                  var center_x: Float,
                  var center_y: Float,
                  var r: Float) : Figure{

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
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(c.color, center = Offset(c.center_x, c.center_y), radius = c.r)
    }
}