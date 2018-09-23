package ggeorgip.androidtemplate.di

import android.content.Context
import dagger.Component
import dagger.android.AndroidInjectionModule
import ggeorgip.androidtemplate.activities.MainActivity
import ggeorgip.androidtemplate.di.modules.AppModule
import ggeorgip.androidtemplate.di.modules.RepositoryModule
import ggeorgip.androidtemplate.di.modules.ViewModelModule
import javax.inject.Singleton

/**
 * Created by Georgi Petrov on 6.8.2018 г..
 */

@Singleton
@Component(modules = [
    AppModule::class,
    ViewModelModule::class,
    AndroidInjectionModule::class,
    RepositoryModule::class])
interface AppComponent {
    fun context(): Context
    fun inject(clazz: MainActivity)
}