package com.shind.criminalintent

import android.app.Application

class CriminalIntentApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialise(this)
    }
}