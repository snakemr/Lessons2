// Пожалуйста, не меняйте список импорта:
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Outbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.gson.*
import kotlinx.coroutines.launch


private enum class MailMenu(
    val label: String,
    val icon: ImageVector
) {
    Send("Отправить", Icons.AutoMirrored.Default.Send),
    Inbox("Входящие", Icons.Default.Mail),
    Outbox("Исходящие", Icons.Default.Outbox),
    Account("Аккаунт", Icons.Default.AccountBox)
}

@Composable
fun Lesson5x19(users: List<data.User>)  {

}

//@Composable
//private fun UserInfo(user: User, onLogout: () -> Unit) { }