package kotlinexample.loopexample

import kotlin.random.Random

fun main(){
    val num = Random.nextInt(1,101)
    loop@for( i in 0..100){
        println("제${i}차 반복")
        for(j in i..100){
            print(".")
            if(num==j){ //num값을 찾으면 바깥 for문도 종료
                println("찾았다!!")
                break@loop
            }
        }
    }
}