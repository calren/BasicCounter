package com.caren.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: NumberViewModel by viewModels()

        val numberTextView = findViewById<TextView>(R.id.number)

        val numberObserver = Observer<Int> { newValue ->
            // Action to take when the value is updated
            numberTextView.text = newValue.toString()
        }

        viewModel.number.observe(this, numberObserver)

        findViewById<Button>(R.id.subtract).setOnClickListener {
            viewModel.decrementNumber()
        }

        findViewById<Button>(R.id.add).setOnClickListener {
            viewModel.incrementNumber()
        }
    }
}