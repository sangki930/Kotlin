package kotlinexample.coroutineexample.dispatch

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>){
    runBlocking {
        // 전역 스레드 풀 디스패처를 사용해 코루틴을 실행한다
        launch (Dispatchers.Default){
            println(Thread.currentThread().name)    // DefaultDispatcher-worker-1
        }
    }
}