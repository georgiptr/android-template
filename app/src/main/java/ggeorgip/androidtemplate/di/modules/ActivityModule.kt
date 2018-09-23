package ggeorgip.androidtemplate.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ggeorgip.androidtemplate.activities.MainActivity

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun contributeActivityInjector(): MainActivity
}
