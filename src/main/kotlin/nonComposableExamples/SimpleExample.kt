package nonComposableExamples

import Figures.Arc
import Figures.Circle
import Figures.Line
import Figures.Rect
import Time.Timer
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

fun nonComposable()
{
    val a = Arc(Color.DarkGray, 45f, 90f, 100f, 60f, 60f)
    Timer.Wait(1000L)
    val r = Rect(Color.Green, 75f, 145f, Size(70f, 70f))
    val c = Circle(Color.Blue, 110f, 180f, 25f)
    val l = Line(Color.Red, 145f, 145f, 75f, 215f, 5f)
    Timer.Wait(500L)
    l.color = Color.Black
}