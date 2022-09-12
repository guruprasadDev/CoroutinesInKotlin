import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main(){  //Executes in main thread

    println("Main program starts :- ${Thread.currentThread().name}")

    GlobalScope.launch { //Create a background coroutine that runs on a background thread

        println("Fake work starts :- ${Thread.currentThread().name}")
        Thread.sleep(1000L)  // Pretend doing some work ... may be file upload
        println("Fake work ends :- ${Thread.currentThread().name}")
    }

    // Blocks the current main thread & wait for the coroutine to finish (practically not a right way to wait)
    Thread.sleep(2000)

    println("Main program Ends :- ${Thread.currentThread().name}")


}