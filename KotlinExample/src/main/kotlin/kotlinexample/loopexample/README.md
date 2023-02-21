## 루프

---
- while 루프<br>
while 키워드 다음에 있는 조건을 평가한 후, 이 값이 참이면 '{}'부분을 반복실행한다.
<br>
<br>
- do-while 루프<br>
do-while 루프는 다음 규칙에 따라 평가된다.
1. do와 while 키워드 사이에 있는 '{}'부분을 실행한다.
2. while 키워드 다음에 있는 조건을 평가한다. 이 값이 참이면 1번 단계로 되돌아가고, 이 값이 거짓이면 루프 문 다음에 있는 문을 실행

- for 루프와 이터러블<br>
코틀린에서는 컬렉션과 유사하게 여러 값이 들어있을 수 있는 값에 대한 루프 수행 가능<br>
루프 변수는 일반변수와는 달리 val이나 var를 붙이지 않는다는 점과 루프 변수는 자동으로 불변 값이 된다.<br>
```kotlin
fun main(){
    val a = IntArray(10){it*it} // 0, 1, 4, 9, 16
    println(a.toList()) // 확인
    var sum = 0

    for( x in a) sum+=x

    println("합계 : $sum")
    
    // 짝수 번째 인덱스만 2배로
    for( i in 0..a.lastIndex step 2) a[i]*=2
    
    // 문자열과 배열에는 원소나 문자의 인덱스 범위를 제공하는 indices라는 프로퍼티가 있음
    val b = IntArray(10){it*it}
    for(i in a.indices step 2) a[i]*=2
}
```

- 내포된 루프와 레이블
```kotlin
import kotlin.random.Random

fun main(){
    val num = Random.nextInt(1,101)
    loop@for( i in 0..100){
        println("제${i}차 반복")
        for(j in i..100){
            print(".")
            if(num==j){ //num값을 찾으면 바깥 for문도 종료
                println("찾았다!!")
                break@loop
            }
        }
    }
}
```

- 꼬리 재귀 함수
tailrec이라는 키워드를 붙이면 꼬리 재귀 함수이다.<br>
tailrec을 붙이면 컴파일러가 재귀 함수를 비재귀적인 코드로 자동변환한다.

```kotlin
// 아래의 두 함수는 같은 코드이다.

tailrec fun binIndexOf(
    x:Int,
    array: IntArray,
    from: Int = 0,
    to: Int = array.size
): Int {
    if(from==to) return -1
    val midIndex = (from+to-1)/2
    val mid = array[midIndex]
    return when{
        mid < x -> binIndexOf(x,array,midIndex+1,to)
        mid > x -> binIndexOf(x,array,from, midIndex)
        else -> midIndex
    }
}

fun binIndexOf(
    x:Int,
    array: IntArray,
    from: Int = 0,
    to: Int = array.size
): Int {
    var fromIndex = from
    var toIndex = to

    while (true){
        if(fromIndex == toIndex) return -1
        val midIndex = (fromIndex + toIndex - 1) / 2
        val mid = array[midIndex]

        when{
            mid < x -> fromIndex = midIndex + 1
            mid > x -> toIndex = midIndex
            else -> return midIndex
        }

    }
}

```