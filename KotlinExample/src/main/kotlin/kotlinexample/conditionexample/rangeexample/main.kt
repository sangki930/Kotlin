package kotlinexample.conditionexample.rangeexample

fun main() {

    // 범위 연산 '..'
    val chars = 'a'..'z' // 'a'부타 'z'까지 모든 문자
    val twoDigits = 10..99 // 10부터 99까지의 모든 수
    val zero2One = 0.0..1.0 // 0부터 1까지 모든 부동소숫점

    // in 연산 : 해당 범위 안에 있는 지
    val num1 = 32
    val num2 = 9
    println(num1 in 10..99) // true
    println(num2 in 10..99) // false

    // !in 연산 : 해당 범위 안에 없는 지
    println(num1 !in 10..99) // false
    println(num2 !in 10..99) // true

    // until 연산 : 정수 타입에서만 사용가능하고, 끝 값보다 1작은 수까지 범위를 만듬
    val twoDigitsAnother = 10 until 100

    println(5 in 5..5) // true
    println(5 in 5 until 5) // false
    println(5 in 10..1) // false

    // downTo : 내려가는 진행을 구현할 수 있음
    println( 5 in 10 downTo 1) // true
    println(5 in 1 downTo 10) // 빈 진행이므로 false

    // step 진행의 간격 지정(step값은 항상 양수이어야한다.)
    1..10 step 3 // 1,4,7,10
    15 downTo 9 step 2 // 15,13,11,9
}