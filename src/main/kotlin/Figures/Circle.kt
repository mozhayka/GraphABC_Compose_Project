package Figures

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

data class Circle(val color: Color,
             val center_x: Float,
             val center_y: Float,
             val r: Float) : Figure{

    override fun getName(): String {
        return "DrawCircle"
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