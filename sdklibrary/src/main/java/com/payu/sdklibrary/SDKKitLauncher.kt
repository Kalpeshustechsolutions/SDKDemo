package com.payu.sdklibrary

import android.app.Activity
import android.content.Intent

class SDKKitLauncher {

    fun launch(activity: Activity) {
        goToNextActivity(activity)
    }

    @JvmSynthetic
    internal fun goToNextActivity(activity: Activity){
        activity.startActivity(Intent(activity, SplashActivity::class.java))
    }
}