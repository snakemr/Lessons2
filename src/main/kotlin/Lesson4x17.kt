// Пожалуйста, не меняйте список импорта:
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.automirrored.filled.NavigateNext
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import lessons.Chapter


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Lesson4x17(exit: ()->Unit) {

}

// Список, ограниченный 7 разделами для вашего задания
private val Chapters by lazy {
    Chapter.entries.take(7)
}