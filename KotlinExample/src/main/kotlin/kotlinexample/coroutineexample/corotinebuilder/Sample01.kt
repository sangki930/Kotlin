package kotlinexample.coroutineexample.corotinebuilder

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

suspend fun main(){
    val message = GlobalScope.async {
        delay(2000)
        println("message")
        "abc"
    }

    val count = GlobalScope.async {
        delay(2000)
        println("count")
        1+2
    }

    val result = message.await().repeat(count.await()) // 결과를 받기 위해 await를 쓴다.
    println(result);
}