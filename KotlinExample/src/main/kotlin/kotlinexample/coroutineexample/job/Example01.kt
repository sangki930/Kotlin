package kotlinexample.coroutineexample.job

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val job = launch (start = CoroutineStart.LAZY) {
            println("job started");
        }
        delay(1000)

        println("Preparing to start...")
        job.start();
    }
}