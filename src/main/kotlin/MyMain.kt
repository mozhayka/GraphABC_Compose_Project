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

//    Timer().schedule(5000L) {
//        DrawCircle(color = Color.Blue, center_x = 400.0f, center_y = 320.7f, r = 60f)
////        val c4 = Circle(color = Color.Blue, center_x = 200.0f, center_y = 320.7f, r = 60f)
////        DrawAll()
//    }
//    LaunchedEffect(true) {
//        delay(5000L)
////        currentOnTimeout()
//
//    }

//    delay(5000L)
//    val c4 = Circle(color = Color.Blue, center_x = 200.0f, center_y = 320.7f, r = 60f)
//    LaunchedEffect(Unit) {
//        while(true) {
//            delay(5000)
//            simpleMain()
//            DrawAll()
////            DrawCircle(color = Color.Blue, center_x = 400.0f, center_y = 320.7f, r = 60f)
////
////            DrawAll()
//        }
//    }
    simpleMain()
    DrawAll()
    Executors.newSingleThreadScheduledExecutor().schedule({
        println("swap param")
    }, 6, TimeUnit.SECONDS)
    DrawAll()
//    val c4 = Circle(color = Color.Blue, center_x = 200.0f, center_y = 320.7f, r = 60f)
//    DrawAll()

//    Handler().postDelayed({
//        //doSomethingHere()
//    }, 1000)
//
//    Executors.newSingleThreadScheduledExecutor().schedule({
////        DrawAll()
//        val c5 = Circle(color = Color.Blue, center_x = 400.0f, center_y = 320.7f, r = 60f)
//    }, 5, TimeUnit.SECONDS)
//    DrawAll()
}

