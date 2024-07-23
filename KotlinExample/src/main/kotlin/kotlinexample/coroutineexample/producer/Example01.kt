package kotlinexample.coroutineexample.producer

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        // produce() : 코루틴 빌더, 채널과 비슷한 send() 메서드를 제공하는 Producer 영역을 도입해준다.
        val channel = produce {
            for(n in 1..5){
                val square = n*n
                println("Sending : $square")
                send(square)
            }
        }

        // 코루틴이 종료될 때 producer() 빌더가 자동으로 닫아준다.
    }
}