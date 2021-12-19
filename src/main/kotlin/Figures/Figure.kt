package Figures

import androidx.compose.runtime.Composable

interface Figure
{
    fun getName() : String
//     fun draw()
}

interface DrawableFigure
{
    fun getName() : String
}

@Composable
fun Draw(f : DrawableFigure)
{
    when(f.getName())
    {
        "Circle" -> DrawCircle(f as DrawableCircle)
//            "Rect" -> DrawRect(f as Rect)
    }
}