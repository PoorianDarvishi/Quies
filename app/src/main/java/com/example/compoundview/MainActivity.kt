package com.example.compoundview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<MyCustom>(R.id.myCustom).hideLoading()
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<MyCustom>(R.id.myCustom).showLoading()
        }

    }
}