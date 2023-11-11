package kotlinexample.coroutineexample.corotinebuilder

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// coroutineScope로 감싸면 커스텀 영역을 도입할 수 있음
fun main(){
    runBlocking {
        println("Custom scope start")

        coroutineScope {
            launch {
                delay(100)
                println("Task 1 finished")
            }

            launch {
                delay(100)
                println("Task finished")
            }
        }
        println("Custome scope end")
    }
}