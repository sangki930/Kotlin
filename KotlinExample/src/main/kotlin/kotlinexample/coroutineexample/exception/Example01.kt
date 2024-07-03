package kotlinexample.coroutineexample.exception

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// 예외를 부모 코루틴 트리의 윗부분으로 전달
fun main(args: Array<String>) {
    runBlocking {
        launch {
            throw Exception("Error in task A")
            println("Task A Completed")
        }
        launch {
            delay(1000L)
            println("Task B Completed")
        }

        println("Root")
    }
}