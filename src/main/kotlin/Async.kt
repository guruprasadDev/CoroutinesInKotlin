/**
 * Async Coroutine builder:-
 * Launches a new coroutine without blocking the current thread
 * Inherits the thread & coroutine scope of the immediate parent coroutine
 * Returns a reference to the Deferred<T> object
 */

import kotlinx.coroutines.*

fun main() = runBlocking{
    // Create a blocking coroutine that executes in current thread (main)

    println("Main Program start :- ${Thread.currentThread().name}") // main thread

    val jobDeferred : Deferred<String> =    async {// Thread : main
        println("Fake work starts: ${Thread.currentThread().name}") // Thread: main
        delay(1000) // Coroutine is suspended but Thread : main is free (not blocked)
        println("Fake work finished:- ${Thread.currentThread().name}")
        //Either main thread or some other thread
        "E.Guru Prasad Reddy"
    }

   val num :String =  jobDeferred.await()

    //jobDeferred.join()// join() to delay time

    println("Main program ends :- ${Thread.currentThread().name}")

}