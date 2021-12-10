package com.tmsapp.kotlintest

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.max

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val maxNumber = getMaxNumber(100, 99)
        Log.d("1---1", maxNumber.toString())
    }
    fun getMaxNumber(number1:Int,number2:Int):Int{
        return max(number1,number2)
    }
}


