package com.neyogiry.kmm.sample.pokedex

import android.app.Application
import com.neyogiry.kmm.sample.pokedex.di.appModule
import di.initKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin(appModule)
    }
}