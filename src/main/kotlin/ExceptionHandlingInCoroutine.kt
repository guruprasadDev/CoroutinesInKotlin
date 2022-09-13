import kotlinx.coroutines.*

fun main() = runBlocking{ // Creates a blocking coroutine that executes in current thread(main)
    println("Main Program Starts:- ${Thread.currentThread().name}")

    val job: Job =  launch(Dispatchers.Default){
        try {
            for (i in 0..599) {
                print("$i.")
                delay(5) //or any other suspending function as per our need.

            }
        }catch (ex:CancellationException){
            println("\nException catch safely : ${ex.message}")
        }finally {
            withContext(NonCancellable){
                delay(1000) //generally we don't use suspending function in finally
                println("\n Close resources in finally")
            }
        }
    }
    delay(10) // let's print a few values before we cancle
    job.cancel(CancellationException("My own crash message"))
    job.join()

    println("\n Main program ends :- ${Thread.currentThread().name}")
}