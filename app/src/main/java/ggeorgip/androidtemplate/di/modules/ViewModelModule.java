package ggeorgip.androidtemplate.di.modules;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import ggeorgip.androidtemplate.di.ViewModelKey;
import ggeorgip.androidtemplate.di.ViewModelProviderFactory;
import ggeorgip.androidtemplate.viewmodels.MainViewModel;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    abstract ViewModel mainViewModel(MainViewModel mainViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory factory);


}
