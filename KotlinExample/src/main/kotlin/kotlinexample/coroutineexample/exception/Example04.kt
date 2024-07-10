package kotlinexample.coroutineexample.exception

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {

    runBlocking {
        val deferredA = GlobalScope.async {
            throw Exception("Error in task A")
            println("Task A Completed")
        }

        val deferredB = GlobalScope.async {
            println("Task B Completed")
        }

        try {
            deferredA.await()
        }catch (e: Exception){
            println("Caught $e")
        }
        deferredB.await()
        println("Root")

    }
}