import kotlinx.coroutines.*

fun main() = runBlocking{ // Creates a blocking coroutine that executes in current thread(main)
    println("Main Program Starts:- ${Thread.currentThread().name}")

    val job: Job =  launch{

        for(i in 0..599){
            print("$i.")
            yield() // or use delay() or any other suspending function as per our need.

        }
    }
    delay(5) // let's print a few values before we cancle
    job.cancelAndJoin()

    println("\n Main program ends :- ${Thread.currentThread().name}")
}