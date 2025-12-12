package ru.lionzxy.siriusandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import ru.lionzxy.siriusandroid.ui.EditProfileScreen
import ru.lionzxy.siriusandroid.ui.theme.SiriusAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SiriusAndroidTheme {

            }
        }
    }
}