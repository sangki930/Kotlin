package programmers.basic.코딩기초트레이닝.Day01.문자열반복해서출력하기

fun main(args: Array<String>) {
    val input = readLine()!!.split(' ')
    val s = input[0]
    val n = input[1]!!.toInt()
    for(i in 1..n){
        print(s)
    }
}