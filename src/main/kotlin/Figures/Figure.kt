package Figures

import androidx.compose.runtime.Composable

interface Figure
{
    fun save()
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
        "Circle" -> drawCircle(f as DrawableCircle)
        "Rect" -> drawRect(f as DrawableRect)
        "Arc" -> drawArc(f as DrawableArc)
        "Line" -> drawLine(f as DrawableLine)
    }
}