package kotlinexample.basic

fun main(){
    // val : (함수 main()에서 쓰는) 지역변수(local variable)
    // val은 불변 변수 역할을 한다.
    val a = readLine()!!.toInt() // a를 입력받고 Int로 전환
    val b = readLine()!!.toInt() // b를 입력받고 Int로 전환
    println(a+b)
    
    // 필요하다면 타입 명시도 가능하다
    val n: Int = 100
    val text: String = "Hello!"

    // 초깃값이 지정한 타입에 속하지 않아 컴파일 오류가 생긴다.
    // val n: Int = "Hello!"
}