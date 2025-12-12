package ru.lionzxy.siriusandroid.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class TestViewModel : ViewModel() {
    val stateFlow = MutableStateFlow("Test")
}