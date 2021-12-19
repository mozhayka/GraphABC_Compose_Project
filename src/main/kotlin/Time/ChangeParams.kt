package Time

import Figures.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay
import nonComposableMain

@Composable
fun ChangeParamsAfterDelay()
{
    var rad by remember { mutableStateOf(50f) }
    var x by remember { mutableStateOf(100.5f) }
    var y by remember { mutableStateOf(120f) }
    var color by remember { mutableStateOf(Color.Blue) }
    var exists by remember { mutableStateOf(false) }

    if (exists)
        DrawFiguresFunctions.DrawCircle(color, x, y, rad)

    LaunchedEffect(true) {
        delay(3000L)
        exists = true

        delay(1000L)
        rad += 10f

        delay(1000L)
        color = Color.Red

        delay(1000L)
        y += 100f
        x += 100f
    }
}





