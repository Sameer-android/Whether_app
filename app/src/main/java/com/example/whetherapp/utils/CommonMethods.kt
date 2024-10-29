package com.example.whetherapp.utils

import android.app.Activity
import android.content.Context
import android.view.Window
import android.view.WindowManager
import androidx.core.content.ContextCompat

object CommonMethods {
    fun updateStatusBarQuizColor(activity: Activity, colorResId: Int?) {
        // Color must be in hexadecimal fromat
        val window: Window = activity.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        // Get color from resources
        val color = ContextCompat.getColor(activity, colorResId?:0)
        // Set status bar color
        window.statusBarColor = color
    }
}