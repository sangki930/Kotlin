package programmers.basic.코딩기초트레이닝.Day01.a와b출력하기

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    println("a = ${a}")
    println("b = ${b}")
}