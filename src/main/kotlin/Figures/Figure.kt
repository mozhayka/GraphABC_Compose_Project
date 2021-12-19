package Figures

import androidx.compose.runtime.Composable

interface Figure

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
        "Rect" -> drawRect(f as DrawableRect)
    }
}