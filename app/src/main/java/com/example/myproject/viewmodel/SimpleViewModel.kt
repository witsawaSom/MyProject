package com.example.myproject.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SimpleViewModel : ViewModel() {

    private val _click =  MutableLiveData(0)
    var clickCount : LiveData<Int> = _click

    fun onClick(){
        _click.value = (_click.value ?: 0) + 1
    }

    fun count() = clickCount.value.toString()
}