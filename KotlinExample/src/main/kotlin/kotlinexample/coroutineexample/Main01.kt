package kotlinexample.coroutineexample

import kotlinx.coroutines.delay

suspend fun main(){
    println("Task started")
    delay(1000)
    println("Task finished")
}