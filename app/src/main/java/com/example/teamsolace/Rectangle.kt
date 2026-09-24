package com.example.teamsolace

import android.R.attr.x

class Rectangle(x: Int, y: Int) : Shape(X = x, y) {
    fun area(): Int{
        return x * y
    }
}