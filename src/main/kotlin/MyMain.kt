import ListOfFigures.drawAll
import androidx.compose.runtime.Composable
import nonComposableExamples.car
import nonComposableExamples.clock
import nonComposableExamples.nonComposableMain

@Composable
fun myMain()
{
    nonComposableMain()
//    clock()
//    car()
    drawAll()
}
