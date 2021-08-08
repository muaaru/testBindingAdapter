package com.example.testBindingAdapter.ui.main

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("android:bindVisibleInvisibleGone")
fun View.bindVisibleInvisibleGone(visibilityValue: Boolean?) {
    visibility = when (visibilityValue) {
        true -> View.VISIBLE
        false -> View.INVISIBLE
        else -> View.GONE
    }
}