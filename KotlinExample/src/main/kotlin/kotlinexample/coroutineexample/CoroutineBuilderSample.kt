package kotlinexample.coroutineexample

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.System.currentTimeMillis

fun main(){
    val time = currentTimeMillis();

    GlobalScope.launch {
        delay(100)
        println("Task 1 finished in ${currentTimeMillis()-time}")
    }

    GlobalScope.launch {
        delay(100)
        println("Task 2 finished in ${currentTimeMillis()-time}")
    }

    Thread.sleep(200)
}