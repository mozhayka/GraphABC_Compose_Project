package DrawFiguresFunctions

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

@Composable
fun DrawCircle(color: Color, center_x: Float, center_y: Float, r: Float)
{
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(color, center = Offset(center_x, center_y), radius = r)
    }
}
