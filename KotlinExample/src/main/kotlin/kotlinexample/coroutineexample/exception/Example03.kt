package kotlinexample.coroutineexample.exception

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// 예외를 처리하는 두 번째 방법 async() 빌더에서 사용하는 방법,
// 던져진 예외를 저장했다가 예외가 발생한 계산에 대한 await 호출을 받았을 때 다시 던지는 것
fun main(args: Array<String>) {
    runBlocking {
        val deferredA = GlobalScope.async {
            throw Exception("Error in task A")
            println("Task A Completed")
        }

        val deferredB = GlobalScope.async {
            println("Task B Completed")
        }
        deferredA.await()   // 여기서 예외발생
        deferredB.await()
        println("Root")

    }
}