package com.neyogiry.kmm.sample.pokedex

import android.app.Application
import com.neyogiry.kmm.sample.pokedex.di.appModule
import di.initKoin
import org.koin.android.ext.koin.androidContext

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin(
            appModule,
            appDeclaration = { androidContext(this@MainApplication) }
        )
    }
}