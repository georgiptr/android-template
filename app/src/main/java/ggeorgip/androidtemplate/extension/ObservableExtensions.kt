package ggeorgip.androidtemplate.extension
import io.reactivex.Observable

/**
 * Created by Georgi Petrov on 8.8.2018 г..
 */
public fun <T : Any> Observable<T?>.filterNotNull(): Observable<T> = filter { it != null }.map { it as T }

public fun <T : Any> Observable<T>.filterError(): Observable<T> = materialize().filter{ !it.isOnError }.dematerialize()

public fun <T : Any> Observable<T>.whenError(): Observable<T> = materialize().filter{ it.isOnError }.dematerialize()