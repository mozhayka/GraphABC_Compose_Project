import Figures.Circle
import Figures.Rect
import Time.Timer
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

fun nonComposableMain()
{
    val c = Circle(Color.Blue, 100f, 100f, 10f)
    Timer.Wait(1000L)

    val r = Rect(Color.Red, 0f, 0f, Size(100f, 100f))
    val c2 = Circle(Color.Green, 300f, 300f, 40f)
    c.r += 10f
    Timer.Wait(500L)

    c2.r += 10f
    Timer.Wait(500L)

    val c3 = Circle(Color.Blue, 400f, 300f, 40f)
    c.x = 200f
    Timer.Wait(1000L)

    c.r = 100f
    c.y = 130f
    c.color = Color.Black
}