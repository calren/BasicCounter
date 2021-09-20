package com.caren.simplecounter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NumberViewModel : ViewModel() {

    private val _number = MutableLiveData(0)
    val number: LiveData<Int>
        get() = _number

    fun incrementNumber() {
        // number += 1
        _number.value = _number.value?.plus(1)
    }

    fun decrementNumber() {
        _number.value = _number.value?.minus(1)
    }
}