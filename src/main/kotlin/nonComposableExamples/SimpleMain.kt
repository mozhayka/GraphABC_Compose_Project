package nonComposableExamples

import Figures.Arc
import Figures.Circle
import Figures.Line
import Figures.Rect
import Time.Timer
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

fun nonComposableMain()
{
    val c = Circle(Color.Blue, 110f, 110f, 10f)
    Timer.Wait(1000L)

    val r = Rect(Color.Red, 100f, 100f, Size(400f, 20f))
    val l = Line(Color.Magenta, 100f, 100f, 220f, 220f, 5f)
    c.r += 10f
    Timer.Wait(500L)

    Timer.Wait(500L)
    r.color = Color.Green

    val a = Arc(Color.DarkGray, 30f, 90f, 100f, 60f, 60f)
    c.x = 200f
    Timer.Wait(1000L)

    c.r = 100f
    c.y = 130f
    c.color = Color.Black
}