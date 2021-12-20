package nonComposableExamples

import Figures.Circle
import Figures.Rect
import Time.Timer
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

fun car()
{
    val backWheel = Circle(Color.Black, 200f, 200f, 30f)
    val frontWheel = Circle(Color.Black, 100f, 200f, 30f)
    val body = Rect(Color.Blue, 50f, 100f, Size(200f, 100f))
    val speed = 5
    val delay = 10L

    for (i in 0..100)
    {
        Timer.Wait(delay)
        backWheel.x += speed
        frontWheel.x += speed
        body.x += speed
    }
}