package com.payu.sdkdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.payu.sdklibrary.SDKKitLauncher

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv_launch)
            .setOnClickListener {

                SDKKitLauncher().launch(this)
            }
    }
}