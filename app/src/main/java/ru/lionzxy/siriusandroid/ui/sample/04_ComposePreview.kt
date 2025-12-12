package ru.lionzxy.siriusandroid.ui.sample

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HelloWorld() {
    Box() {
        Text("Привет как дела")
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun HelloWorldPreview() {
    HelloWorld()
}