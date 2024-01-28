package programmers.basic.코딩기초트레이닝.Day01.대소문자바꿔서출력하기

fun main(args: Array<String>) {
    val s1 = readLine()!!
    for(i in s1.indices){
        if(s1[i].isUpperCase()){
            print(s1[i].toLowerCase())
        }else{
            print(s1[i].toUpperCase())
        }
    }
}