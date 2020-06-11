package com.project.gitbingo.app

import android.app.Application
import timber.log.Timber

class GitBingoApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        setupTimber()
    }

    private fun setupTimber() {
        //TOOD(""BUILD CONFIG 확인 하여 TImber 만들기 )
        Timber.plant(Timber.DebugTree())
    }
}