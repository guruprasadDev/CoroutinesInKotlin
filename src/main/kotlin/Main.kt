/**
 * Coroutine in Kotlin:-
    --> Coroutine is an instance of suspendable Computation.
    It is conceptually similar to a thread,in the sense that it takes a block
    of code to run that works concurrently with the rest of the code.

    --> It may suspend its execution in one thread and resume in another thread.

    --> Coroutines is a concurrency pattern design that you can use on android to simplify code that executes Asynchronously

 */


import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {//this : CoroutineScope

    // runBlocking is also a coroutine builder that bridges the non-coroutine world of a regular fun main(

    launch {// 'launch is a coroutine builder. it launches a new coroutine concurrently with the rest of the code'
        delay(3000L) // non-blocking delay for 3 seconds
        print(" `Guru Prasad`") // these line prints after delay
    }
    print("Hello, Iam ") // main coroutine continues while a previous one is a delayed or suspended
}