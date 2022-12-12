package com.basic

fun main(){
    var a = 'a'
    var h = 'h'

    // 코틀린에서는 Char에 대한 연산은 두 문자의 차이는 제외하고 Char로 돌려준다.

    println(a+5) // f
    println(a-5) // \
    println(h-a) // 7
    println(--h) // g
    println(++a) //b
}