@file:JvmSynthetic
package com.payu.sdklibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

internal class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        showToast()
    }

    @JvmSynthetic
    fun showToast(){
        Toast.makeText(this,"Welcome To Lib",Toast.LENGTH_SHORT).show()
    }
}