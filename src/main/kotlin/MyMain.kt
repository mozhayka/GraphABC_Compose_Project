import ListOfFigures.drawAll
import androidx.compose.runtime.Composable
import nonComposableExamples.nonComposableMain

@Composable
fun myMain()
{
    nonComposableMain()
    drawAll()
}
