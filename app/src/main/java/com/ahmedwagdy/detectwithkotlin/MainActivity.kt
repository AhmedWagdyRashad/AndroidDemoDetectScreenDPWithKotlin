package com.ahmedwagdy.detectwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   private var mUseFragment:Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val su = ScreenUtility(this)
        text_out.text = String.format("Width: %s, Height: %s",
                su.dpWidth, su.dpHeight)

        mUseFragment = su.dpWidth >= 420

        Toast.makeText(this, "Is Width >= 420 ? $mUseFragment",
                Toast.LENGTH_SHORT).show()
    }
}