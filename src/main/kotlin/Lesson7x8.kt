// Пожалуйста, не меняйте список импорта:
import android.*
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import java.text.DecimalFormat

//<manifest: Здесь всего лишь симуляция, но в настоящем Android-приложении манифест должен содержать строки:
//  <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
//  <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
//Кроме того, в файле build.gradle.kts модуля App проекта необходимо подключить зависимость GooglePlayServices:
//  implementation("com.google.android.gms:play-services-location:21.3.0")

@Composable
fun Lesson7x8() {

}

//@Composable
//private fun RowScope.GeoCard(label: String, value: Double?) { }