package com.basic

// 비트 연산
fun main(){

    // 왼쪽 시프트
    println(13 shl 2)
    println((-13) shl 2)
    // 오른쪽 시프트
    println(13 shr 2)
    println((-13) shr 2)
    // 부호 없는 오른쪽 시프트
    println(13 ushr 2)
    println((-13) ushr 2)
    // 비트곱(and)
    println(13 and 19)
    println(-13 and 19)
    // 비트합(or)
    println(13 or 19)
    println(-13 or 19)
    // 비트 배타합
    println(13 xor 19)
    println(-13 xor 19)
    // 비트 반전
    println(13.inv())
    println((-13).toInt())
}