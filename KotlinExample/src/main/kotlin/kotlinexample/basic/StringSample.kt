package kotlinexample.basic

import java.time.LocalDate
import java.util.Date

fun main(){

    // 문자열 연산
    var s1 = "Hello!"
    var s2 = s1+"World!!"
    println(s2)

    // 템플릿
    val name = readLine()
    println("Hello, $name!\n Today is ${Date()}")
    println("Hello, $name!\n Today is ${LocalDate.now()}")
    
    val message = """
        Hello, $name!
        Today is ${Date()}
    """.trimIndent()
    // trimIndent() : 여러 줄에 공통된 최소 들여쓰기 제거

    // 기본 문자열 연산
    var s = "Hello!"

    println(s.length) // 6
    println(s.lastIndex) // 5(첫 번째 문자의 인덱스가 0이므로)

    println(s[0]) // H
    println(s[1]) // e
    println(s[5]) // !
    // println(s[10]) // 에러(잘못된 인덱스), StringIndexOutOfBoundsException
    
    // 문자열 동등비교
    val s3 = "Hello!"
    val s4 = "Hel"+"lo!"
    println(s3==s4) // true
    // 이는 println(s1.equals(s2))와 같다.
    // Java와는 다르게 코틀린에서는 ==가 기본적으로 equals()호출한다.
    
    // Java의 ==,!=와 동등하게 쓸려면, 각각 ===,!== 연산자를 사용하면된다.
    println(s3===s4) // false
    
    // 주요 함수
    // 1. isEmpty, isNotEmpty : 문자열이 비어있는 지
    println("Hello".isEmpty())
    println("".isEmpty())
    println("Hello".isNotEmpty())
    
    // 2. substring : 부분문자열 추출
    println("Hello".substring(2))
    println("Hello".substring(1,3))
    
    // 3. startsWith, endsWith : 접미사 또는 접두사인지
    println("Hello".startsWith("Hel"))
    println("Hello".endsWith("lo"))
    
    // 4. indexOf : 인자로 받은 문자나 문자열이 수신 객체인 문자열에 나타나는 첫 번째 인덱스 반환
    // 맨 앞부터
    println("abcabc".indexOf('b'))
    println("abcabc".indexOf("cd"))
    println("abcabc".indexOf("ca"))
    
    // 주어진 인덱스부터 찾기
    println("abcabc".indexOf('b',2))
    println("abcabc".indexOf("ab",2))
    
}