package com.basic

fun main(){
    var sum = 1
    sum += 2
    sum += 3
    println(sum); //6

    // 처음 변수에 값을 대입할 때 추론된 변수 타입은 변수가 불변이든 그렇지 않든 계속 유지된다.
    //    sum = "Hello" (컴파일 오류)

    var a = 1
    println(a++) // a : 2, 출력 : 1
    println(++a) // a : 3, 출력 : 3
    println(--a) // a : 2, 출력 : 2
    println(a--) // a : 2, 출력 : 1
}