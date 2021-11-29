import DrawFiguresFunctions.CanvasDrawExample
import Figures.Circle
import DrawFiguresFunctions.DrawCircle
import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.singleWindowApplication




fun myMain() = singleWindowApplication()
{
    CanvasDrawExample()
    DrawCircle(color = Color.Blue, center_x = 100.5f, center_y = 120.7f, r = 40f)
}