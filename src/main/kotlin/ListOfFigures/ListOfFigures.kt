package ListOfFigures

import Figures.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

//class ListOfFigures {
//    companion object{
//        var l = arrayListOf<Figure>()
//
//        fun Add(f : Figure)
//        {
//            l.add(f)
//        }
//    }
//}
//
//
//@Composable
//fun DrawAll()
//{
//    ListOfFigures.l.forEach{
//        when(it.getName())
//        {
//            "Circle" -> DrawCircle(it as Circle)
//            "Rect" -> DrawRect(it as Rect)
//        }
//
//        Executors.newSingleThreadScheduledExecutor().schedule({
//            println("swap param")
//            if (it.getName() == "Circle")
//                (it as Circle).r = 100.0f
//        }, 5, TimeUnit.SECONDS)
//    }
//}