@file:Suppress("unused", "SpellCheckingInspection")

package ru.lionzxy.siriusandroid.ui.sample

import android.widget.TextView
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun ViewInterop() {
    AndroidView(
        { context ->
            TextView(context)
        }
    )
}