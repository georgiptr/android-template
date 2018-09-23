package ggeorgip.androidtemplate.di.modules

import dagger.Module
import dagger.Provides
import ggeorgip.androidtemplate.repositories.IMainRepository
import ggeorgip.androidtemplate.repositories.MainRepository
import javax.inject.Singleton

/**
 * Created by Georgi Petrov on 7.8.2018 г..
 */
@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMainRepository(): IMainRepository {
        return MainRepository()
    }

}
