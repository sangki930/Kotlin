package kotlinexample.loopexample

import kotlin.random.Random

fun main(){
    val num = Random.nextInt(1,101)
    var guess = 0

    while(guess!=num){
        guess = readLine()!!.toInt()
        var message = "";
        if(guess < num) message = "너무 작습니다."
        else if(guess > num ) message = "너무 큽니다."
        println(message)
    }
    println("정담은 $num 였습니다.")
}