package ggeorgip.androidtemplate.viewmodels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import ggeorgip.androidtemplate.repositories.IMainRepository
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.subjects.PublishSubject
import javax.inject.Inject

interface MainViewModelInputOutput {
    val input: MainViewModelInput
    val output: MainViewModelOutput
}

interface MainViewModelInput {
    fun someBtn()
}

interface MainViewModelOutput {
    val someOutput: Observable<Unit>
}

class MainViewModel @Inject constructor(private val repository: IMainRepository, application: Application
) : AndroidViewModel(application), MainViewModelInput, MainViewModelOutput, MainViewModelInputOutput {

    //region CONST Exposed Input and Output
    override val input: MainViewModelInput
        get() = this
    override val output: MainViewModelOutput
        get() = this
    //endregion

    //region override output
    override val someOutput: Observable<Unit>
    //endregion

    //region local
    private val compositeDisposable = CompositeDisposable()
    private val someBtnSubject = PublishSubject.create<Unit>()
    //endregion

    init {
        someOutput = someBtnSubject
    }

    override fun someBtn() {
        someBtnSubject.onNext(Unit)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

}