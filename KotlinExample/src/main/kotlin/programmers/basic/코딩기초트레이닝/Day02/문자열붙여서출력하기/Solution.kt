package programmers.basic.코딩기초트레이닝.Day02.문자열붙여서출력하기

fun main(args: Array<String>) {
    val input = readLine()!!.split(' ')
    val s1 = input[0]
    val s2 = input[1]
    println("""${s1}${s2}""")
}