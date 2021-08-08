package com.example.testBindingAdapter.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _visibilityValue = MutableLiveData<Boolean?>()
    val visibilityValue: LiveData<Boolean?> = _visibilityValue

    fun setVisibilityValue(value: Boolean?) {
        _visibilityValue.postValue(value)
    }
}