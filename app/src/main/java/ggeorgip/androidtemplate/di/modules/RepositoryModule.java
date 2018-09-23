package ggeorgip.androidtemplate.di.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ggeorgip.androidtemplate.repositories.IMainRepository;
import ggeorgip.androidtemplate.repositories.MainRepository;

/**
 * Created by Georgi Petrov on 7.8.2018 г..
 */
@Module
public class RepositoryModule {

    @Provides
    @Singleton
    public IMainRepository provideMainRepository() {
        return new MainRepository();
    }

}
