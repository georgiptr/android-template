package ggeorgip.androidtemplate

import android.app.Application
import ggeorgip.androidtemplate.di.AppComponent
import ggeorgip.androidtemplate.di.modules.AppModule

class MainApplication: Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this, this))
            .build()
    }

}