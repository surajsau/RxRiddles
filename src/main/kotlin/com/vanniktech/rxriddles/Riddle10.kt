package com.vanniktech.rxriddles

import io.reactivex.Observable

object Riddle10 {
    /**
     * Use the [first] Observable and flatten it with the results of the [function] that returns an Observable.
     *
     * Use case: Get some user data and perform a network request with the user data and have both data accessible afterwards.
     */
    fun solve(first: Observable<Int>, function: (Int) -> Observable<String>): Observable<Pair<Int, String>>
        = first.flatMap(function) {t1, t2 -> Pair(t1, t2)}

}
