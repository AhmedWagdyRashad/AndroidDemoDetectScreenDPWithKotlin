package com.ahmedwagdy.detectwithkotlin

import android.app.Activity
import android.util.DisplayMetrics

class ScreenUtility(activity:Activity) {
    var dpWidth = 0f
    var dpHeight = 0f

        init {
            val display = activity.windowManager.defaultDisplay
            val outMatrices = DisplayMetrics()
            display.getMetrics(outMatrices)
            val density = activity.resources.displayMetrics.density
            dpWidth = outMatrices.widthPixels /density
            dpHeight = outMatrices.heightPixels /density
        }


}