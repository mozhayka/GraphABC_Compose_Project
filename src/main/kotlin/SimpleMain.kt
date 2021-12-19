import Figures.Circle2
import Time.Timer
import androidx.compose.ui.graphics.Color

fun nonComposableMain()
{
    val c = Circle2(Color.Blue, 100f, 100f, 10f)
    Timer.Wait(1000L)

    val c2 = Circle2(Color.Green, 300f, 300f, 40f)
    c.r += 10f
    Timer.Wait(500L)

    c2.r += 10f
    Timer.Wait(500L)

    c.x = 200f
    Timer.Wait(1000L)

    c.r = 100f
    c.y = 130f
    c.color = Color.Black
}