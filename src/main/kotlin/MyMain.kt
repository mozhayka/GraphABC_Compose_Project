import Figures.Circle
import ListOfFigures.DrawAll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay
import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.logging.Handler

import kotlin.concurrent.schedule


@Composable
fun myMain()
{
    simpleMain()
    DrawAll()
}

