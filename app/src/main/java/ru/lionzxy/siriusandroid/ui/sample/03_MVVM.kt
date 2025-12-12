package ru.lionzxy.siriusandroid.ui.sample

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.lionzxy.siriusandroid.ui.viewmodel.TestViewModel

@Composable
fun MVVMComposable() {
    val testViewModel = viewModel<TestViewModel>()
    val input by testViewModel.stateFlow.collectAsState()
    Text("Hello, $input")
}