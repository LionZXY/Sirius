package ru.lionzxy.siriusandroid.ui.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ModifiersComposable() {
    Box(
        modifier = Modifier
            .background(Color.Red)
    ) {
        Text("Привет")
    }
}

@Composable
fun ModifiersCombineComposable() {
    val modifier = Modifier.size(20.dp)
        .background(Color.Gray)

    Box(
        modifier = modifier
            .background(Color.Red)
    )
}

@Composable
@Preview
fun ModifiersThenComposable() {
    val modifier = Modifier.size(20.dp)
        .background(Color.Red)

    Box(
        modifier = Modifier
            .background(Color.Gray)
            .then(modifier)
    )
}