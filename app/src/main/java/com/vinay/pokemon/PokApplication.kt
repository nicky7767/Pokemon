package com.vinay.pokemon
import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class PokApplication: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}