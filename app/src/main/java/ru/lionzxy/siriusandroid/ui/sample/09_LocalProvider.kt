package ru.lionzxy.siriusandroid.ui.sample

import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

val LocalContentColor = compositionLocalOf { Color.Black }

@Composable
fun LocalProviderExample() {
    CompositionLocalProvider(LocalContentColor provides Color.Red) {
    }
}