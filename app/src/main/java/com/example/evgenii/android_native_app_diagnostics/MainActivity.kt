package com.example.evgenii.android_native_app_diagnostics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCenter.start(application, "c52d9e5c-b1e5-4422-a176-7136b6dd47b4",
                Analytics::class.java, Crashes::class.java)
        AppCenter.setLogUrl("https://in-integration.dev.avalanch.es")


        setContentView(R.layout.activity_main)
    }

    fun generateCrash() {
        
    }
}
