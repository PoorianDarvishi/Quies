package com.example.compoundview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.isVisible

class MyCustom @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {
    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.my_custom_layout, this, true)
    }
    fun hideLoading(){
        findViewById<ImageView>(R.id.image).isVisible = false
        findViewById<TextView>(R.id.text2).text = "stop"
    }
    fun showLoading(){
        findViewById<ImageView>(R.id.image).isVisible = true
    }
}

