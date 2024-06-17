package kotlinexample.coroutineexample.timeout

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import java.io.File

// 타임아웃 예제
// 설명 : 작업이 완료되기에 무작정 기다릴 수 없어 타임아웃 설정이 필요할 때가 있다.
fun main(args: Array<String>) {
    runBlocking {
        val asyncData = async {
            File("data.txt").readText()
        }
        try {
            val text = withTimeout(50L){asyncData.await()}
            println("데이터 로드됨 : $text")
        }catch (e: Exception){
            println("시간이 초과되었습니다.")
        }
    }
}