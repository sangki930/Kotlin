package kotlinexample.coroutineexample.job

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.coroutineContext

fun main(args: Array<String>) {
    runBlocking {
        val job = coroutineContext[Job.Key]!!
        val jobA = launch {
            println("This is task A")
        }
        val jobB = launch {
            println("This is task B")
        }
        jobA.join() // join : 메서드를 사용하면 조인 대상 잡이 완료될 때까지 현재 코루틴을 일시 중단시킬 수 있다.
        jobB.join()
        println("${job.children.count()} children is running")
    }


}