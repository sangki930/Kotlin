package kotlinexample.coroutineexample.dispatch


import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.ScheduledThreadPoolExecutor
import java.util.concurrent.atomic.AtomicInteger

fun main(){
    val id = AtomicInteger(0)

    val executor = ScheduledThreadPoolExecutor(5){
        runnable->Thread(runnable,"WorkerThread-${id.incrementAndGet()}").also { it.isDaemon = true }
    }

    executor.asCoroutineDispatcher().use { dispatcher ->
        runBlocking {
            for(i in 1..3){
                launch(dispatcher) {
                    println(Thread.currentThread().name)
                    kotlinx.coroutines.delay(1000) // 실행기가 별도의 스레드를 만듦
                }
            }
        }
    }
}