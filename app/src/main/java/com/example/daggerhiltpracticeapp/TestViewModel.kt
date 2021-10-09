package com.example.daggerhiltpracticeapp

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("Test String 1") myTestString: String
) : ViewModel() {
    init {
        Log.d("ViewModel", "$myTestString")
    }
}