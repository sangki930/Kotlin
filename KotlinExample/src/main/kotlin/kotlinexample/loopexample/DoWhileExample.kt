package kotlinexample.loopexample

fun main(){
    var sum = 0
    var num = -1
    do {
        num = readLine()!!.toInt()
        sum += num
    }while (num!=0)

    println("Sum : $sum")
}