package com.kdang.base.sample.application

import android.app.Application
import androidx.lifecycle.LifecycleObserver
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() , LifecycleObserver {
    companion object{

    }
    override fun onCreate() {
        super.onCreate()
    }


}