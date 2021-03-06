package net.gotev.swapiclient

import android.app.Application
import net.gotev.swapi.initializeSwapiClient
import net.gotev.swapi.swapiClient

/**
 * @author Aleksandar Gotev
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()

        initializeSwapiClient(this)
    }
}
