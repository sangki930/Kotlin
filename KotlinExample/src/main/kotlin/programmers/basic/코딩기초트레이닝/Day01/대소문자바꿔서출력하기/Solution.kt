package programmers.basic.코딩기초트레이닝.Day01.대소문자바꿔서출력하기

fun main(args: Array<String>) {
    val s1 = readLine()!!
    s1.map { if (it.isLowerCase()) it.uppercase() else it.lowercase() }
        .joinToString("")
        .also { println(it) }
}