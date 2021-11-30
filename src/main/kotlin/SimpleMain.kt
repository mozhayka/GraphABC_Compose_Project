import Figures.Circle
import Figures.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

fun simpleMain()
{
    val c = Circle(color = Color.Blue, center_x = 100.5f, center_y = 120.7f, r = 40f)
    val c2 = Circle(color = Color.Green, center_x = 150.0f, center_y = 170.7f, r = 70f)
    val c3 = Circle(color = Color.Red, center_x = 200.0f, center_y = 220.7f, r = 60f)
    val r = Rect(color = Color.Black, topLeft_x = 240.5f, topLeft_y = 200f, size = Size(80f, 200f))
    c.r = 100f
}