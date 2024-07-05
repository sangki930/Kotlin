package kotlinexample.coroutineexample.exception

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main(args: Array<String>) {
    val handler = CoroutineExceptionHandler { _, exception ->
        println("CoroutineExceptionHandler got $exception")
    }

    GlobalScope.launch (handler){
        launch {
            throw Exception("Error in task A")
            println("Task A Completed")
        }
        launch {
            delay(1000L)
            println("Task B Completed")
        }

        println("Root")
    }.join()
}