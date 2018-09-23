package ggeorgip.androidtemplate.di

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import ggeorgip.androidtemplate.MainApplication
import ggeorgip.androidtemplate.di.modules.ActivityModule
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
    AndroidInjectionModule::class,
    ActivityModule::class,
    ViewModelModule::class,
    RepositoryModule::class])
interface AppComponent: AndroidInjector<MainApplication> {}