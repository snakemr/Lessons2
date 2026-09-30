// Пожалуйста, не меняйте список импорта:
import android.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

@Composable
fun Lesson4x10() {

}

// Используйте эту функцию для открытия ссылки по щелчку на баннер:
private fun Context.showInfo() = startActivity(
    Intent(Intent.ACTION_VIEW, "https://www.kinopoisk.ru/film/258687/".toUri())
)