import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class SimpleTest{

    @Test
    fun myFirstTest() = runBlocking() {
        myOwnSuspendingFunc(2000)
        Assert.assertEquals(5,20+10) 
    }

}