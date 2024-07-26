package kotlinexample.coroutineexample.channel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

// 팬 아웃 : 한 채널을 여러 코루틴이 읽는 것
fun main() {
    runBlocking {
        val streamSize = 5
        val channel = Channel<Int>(2)

        // 아래의 코루틴은 정수 제곱 값의 스트림을 만들어냄
        launch {
            for(n in 1..streamSize) {
                delay(Random.nextLong(100))
                val square: Int = n*n
                println("Sending: $square")
                channel.send(square)    // send() : 데이터를 보냄
            }
            channel.close() // 채널이 닫혀서 더 이상 데이터를 보내지 않는다는 신호
        }

        for(i in 1..3){
            launch {
                for(n in channel){
                    println("Receiving by Consumer #$i: $n")
                    delay(Random.nextLong(100))
                }
            }
        }

        //  생산자 코루틴이 생성한 데이터 스트림을 세 소비자 코루틴이 나눠 받는다.
    }
}