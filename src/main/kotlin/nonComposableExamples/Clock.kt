package nonComposableExamples

import Figures.Arc
import Time.Timer
import androidx.compose.ui.graphics.Color

fun clock()
{
    val a = Arc(Color.DarkGray, -90f, 0f, 50f, 100f, 100f)
    for (i in 0..60)
    {
        Timer.Wait(1000L)
        a.sweepAngle += 6f
    }
}