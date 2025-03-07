package kotlinexample.coroutineexample

import kotlinx.coroutines.delay

class CoroutineExample {
    // suspend : 일시 중지
    suspend fun foo(){
        println("Task started")
        delay(100) // delay :  현재 스레드를 블럭시키지 않고 자신을 호출한 함수를 일시 중단
        println("Task finished")
    }
}