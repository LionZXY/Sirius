package ru.lionzxy.siriusandroid.ui.sample

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ImperativeComposable(isActive: Boolean) {
    Box {
        if (isActive) {
            Text("Лампочка горит!")
        } else {
            Text("Лампочка не горит!")
        }
    }
}