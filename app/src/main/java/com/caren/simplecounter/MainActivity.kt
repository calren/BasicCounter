package com.caren.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: NumberViewModel by viewModels()

        val numberTextView = findViewById<TextView>(R.id.number)

        findViewById<Button>(R.id.subtract).setOnClickListener {
            viewModel.decrementNumber()
            numberTextView.text = viewModel.number.toString()
        }

        findViewById<Button>(R.id.add).setOnClickListener {
            viewModel.incrementNumber()
            numberTextView.text = viewModel.number.toString()
        }
    }
}