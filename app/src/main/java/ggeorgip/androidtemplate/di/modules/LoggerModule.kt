package ggeorgip.androidtemplate.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import ggeorgip.androidtemplate.BuildConfig
import ggeorgip.androidtemplate.logging.DefaultLogger
import ggeorgip.androidtemplate.logging.Logger
import javax.inject.Singleton

/**
 * Created by Georgi Petrov on 7.8.2018 г..
 */
@Module
class LoggerModule {

    @Provides
    @Singleton
    fun provideLogger(context: Context): Logger {
        val logger = DefaultLogger(context)
        if (BuildConfig.DEBUG) {
            logger
                    .configureAnalytics(false, true, "Debug")
                    .configureCrashlytics(false, true, "Debug")
        } else {
            logger
                    .configureAnalytics(true, false, "Release")
                    .configureCrashlytics(true, false, "Release")
        }
        return logger
    }

}
