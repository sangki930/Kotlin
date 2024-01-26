package programmers.basic.Day06.직각삼각형출력하기


fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)
    for(i in 1..n){
        for(j in 1..i)
            print("*")
        println()
    }

}