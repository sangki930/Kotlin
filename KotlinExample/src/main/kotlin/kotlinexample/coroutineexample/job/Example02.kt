package kotlinexample.coroutineexample.job

import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        val job = coroutineContext[Job.Key]!!

        launch { println("This is taskA") } // 람다 블록의 실행을 끝내면 '완료 중' 상태로 변함
        launch { println("This is taskB") }

        // 2개의 자식 잡이 동작 중이다.
        println("${job.children.count()} children is running");

        // 모든 자식이 완료되면 잡의 상태가 '완료됨'으로 바뀐다.
    }
}