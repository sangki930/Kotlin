package kotlinexample.coroutineexample.channel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

// 채널 내부 버퍼가 꽉 찼을 때 데이터를 채널에 보내려고 하면, 채널은 현재 코루틴을 일시 중단시키고 나중에 처리가
// 가능할 때 재개함
// 값이 합쳐지는 채널은 스트림에 기록한 모든 원소가 도착할 필요가 없고 소비자 코루틴이 뒤쳐지면
// 상산자가 만들어낸 값 중 일부를 버려도 되는 경우에 쓰인다.
fun main() {
    runBlocking {
        val streamSize = 5
        val channel = Channel<Int>(Channel.CONFLATED)

        // 아래의 코루틴은 정수 제곱 값의 스트림을 만들어냄
        launch {
            for(n in 1..streamSize) {
                delay(Random.nextLong(100))
                val square: Int = n*n
                println("Sending: $square")
                channel.send(square)    // send() : 데이터를 보냄
            }
        }

        // 아래의 코루틴은 두 번째 코루틴이 생성된 수를 수신한다.
        launch {
            for(n in 1..streamSize) {
                delay(Random.nextLong(200))
                val n = channel.receive()   // receive() : 데이터를 받음
                println("Receiving n: $n")
            }
        }
    }
}