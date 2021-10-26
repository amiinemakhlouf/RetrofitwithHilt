package com.example.apiwithhilt.core

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ApiWithHiltApp:Application() {
    override fun onCreate() {
        super.onCreate()
    }
}