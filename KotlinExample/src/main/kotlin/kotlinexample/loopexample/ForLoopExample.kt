package kotlinexample.loopexample

fun main(){
    val a = IntArray(10){it*it} // 0, 1, 4, 9, 16
    println(a.toList()) // 확인
    var sum = 0

    for( x in a) sum+=x

    println("합계 : $sum")

    // 짝수 번째 인덱스만 2배로
    for( i in 0..a.lastIndex step 2)
        a[i]*=2

    // 문자열과 배열에는 원소나 문자의 인덱스 범위를 제공하는 indices라는 프로퍼티가 있음
    val b = IntArray(10){it*it}
    for(i in a.indices step 2) a[i]*=2
}