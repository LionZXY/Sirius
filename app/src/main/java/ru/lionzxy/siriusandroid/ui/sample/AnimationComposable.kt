package ru.lionzxy.siriusandroid.ui.sample

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import kotlin.math.roundToInt
import kotlin.time.Duration.Companion.seconds

@Preview
@Composable
fun AnimationComposable() {
    var isRed by remember { mutableStateOf(false) }
    val color by animateColorAsState(
        if (isRed) {
            Color.Red
        } else Color.Gray,
        animationSpec = tween(
            10.seconds.inWholeMilliseconds.toInt()
        )
    )
    Box(
        modifier = Modifier
            .background(color)
    ) {
        Text(
            modifier = Modifier.clickable {
                isRed = !isRed
            }, text = "Change color" + animatedDots()
        )
    }
}


private const val DOTS_COUNT = 3f
private const val DOTS_DURATION_MS = 3000

@Composable
fun animatedDots(): String {
    val infiniteTransition = rememberInfiniteTransition()
    val dotsCount by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = DOTS_COUNT,
        animationSpec = infiniteRepeatable(
            animation = tween(DOTS_DURATION_MS, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        )
    )
    return ".".repeat(dotsCount.roundToInt())
}
