package com.example.daggerhiltpracticeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint// to inject something we need this annotation
class MainActivity : AppCompatActivity() {
    @Inject
    @Named("Test String 2")
    lateinit var testString:String

//    private val viewModel:TestViewModel by
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    Log.d("View Model","$testString")
    }
}