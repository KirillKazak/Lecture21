package com.example.lecture21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.chip.ChipDrawable
import java.lang.reflect.Type
import java.util.concurrent.Callable
import java.util.concurrent.Future
import java.util.concurrent.FutureTask
import kotlin.reflect.KProperty

class MainActivity : AppCompatActivity() {
    val a = 5
    var str : String by Delegat()
    internal val c: Int by lazy { 1 }
    lateinit var c1 : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (::c1.isInitialized) {
            Log.d("LATE", "Hello")
        }
    }
}

class Delegat{
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return ""
        Log.d("GET", "Get value")
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        Log.d("SET", "Set value")
    }
}


