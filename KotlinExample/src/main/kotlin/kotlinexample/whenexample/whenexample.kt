package kotlinexample.whenexample

import kotlin.random.Random

fun main(){

}

fun numberDespcription(n:Int, max:Int=100): String = when(n){
    0->"Zero"
    1,2,3->"Small"
    in 4..9 ->"Medium"
    in 10..max->"Large"
    !in Int.MIN_VALUE until 0->"Negative"
    else -> "Huge"
}