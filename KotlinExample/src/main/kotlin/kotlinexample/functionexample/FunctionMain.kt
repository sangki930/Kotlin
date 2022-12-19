package kotlinexample.functionexample

fun swap(s:String,from:Int,to:Int): String {
    val chars = s.toCharArray() // 배열로 변환
    // 배열 원소 교환하기
    val tmp = chars[from]
    chars[from] = chars[to]
    chars[to] = tmp
    return chars.concatToString() // 문자열로 반환
}

fun main(){

    // sample
    println(swap("Hello",1,2))
    println(swap("Hello",from=1,to=2))
    println(swap("Hello",to=3,from=0))
    println(swap("Hello",1,to=3))
    println(swap(from=1,s="Hello",to=2))

    // 위치 기반 인자와 이름 붙은 인자를 혼용한 경우 kotlin 1.4 이후
    println(swap(s="Hello",1,2))
    println(swap(s="Hello",1,to=2))

    // 컴파일 오류
//    println(swap(s="Hello",2,from=1))
//    println(swap(1,2,s="Hello"))
}
