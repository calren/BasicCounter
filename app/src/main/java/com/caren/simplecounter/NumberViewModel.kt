package com.caren.simplecounter

import androidx.lifecycle.ViewModel

class NumberViewModel : ViewModel() {

    var number = 0

    fun incrementNumber() {
        number += 1
    }

    fun decrementNumber() {
        number -= 1
    }
}