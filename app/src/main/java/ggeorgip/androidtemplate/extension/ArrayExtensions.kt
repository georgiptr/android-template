package ggeorgip.androidtemplate.extension

import android.util.Log
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by Georgi Petrov on 8.8.2018 г..
 */
fun List<Disposable>.addTo(compositeDisposable: CompositeDisposable) {
    this.forEach { compositeDisposable.add(it) }
}

fun <R> Observable<R>.debug(tag: String): Observable<R> {

    return doOnSubscribe {
        Log.d(tag, "Subscribed")
    }.doOnNext {
        Log.d(tag, "On Next")
    }
        .doOnComplete {
            Log.d(tag, "Completed")
        }
        .doOnError {
            Log.d(tag, "Error")
        }
        .doOnDispose {
            Log.d(tag, "Disposed")
        }
}