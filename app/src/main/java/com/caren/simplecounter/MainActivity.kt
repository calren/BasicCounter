package com.caren.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberTextView = findViewById<TextView>(R.id.number)

        findViewById<Button>(R.id.subtract).setOnClickListener {
            number -= 1
            numberTextView.text = number.toString()
        }

        findViewById<Button>(R.id.add).setOnClickListener {
            number++
            numberTextView.text = number.toString()
        }
    }
}