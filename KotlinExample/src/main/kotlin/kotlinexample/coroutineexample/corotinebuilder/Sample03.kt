package kotlinexample.coroutineexample.corotinebuilder

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


// 코루틴 영역과 구조적 동시성
fun main(){

    runBlocking {
        println("Parent task started");

        launch {
            println("Task A started"                    );
            delay(200)
            println("Task A finished")
        }

        launch {
            println("Task B started")
            delay(200)
            println("Task B finished")
        }
    println();
    }

    println("shutting down");
}