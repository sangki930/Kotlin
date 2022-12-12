package com.basic

fun main(){
    // val : (함수 main에서 쓰는) 지역변수(local variable)
    val a = readLine()!!.toInt() // a를 입력받고 Int로 전환
    val b = readLine()!!.toInt() // b를 입력받고 Int로 전환
    println(a+b)
    
    // 필요하다면 타입 명시도 가능하다
    val n: Int = 100
    val text: String = "Hello!"
}