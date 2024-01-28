package programmers.basic.코딩기초트레이닝.Day02.홀짝구분하기

fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    if(a%2==0){
        println("""${a} is even""")
    }else
        println("""${a} is odd""")
}