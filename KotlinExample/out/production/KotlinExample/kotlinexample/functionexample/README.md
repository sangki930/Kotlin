## 함수

---

- 함수 활용 예

```kotlin
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

    
}
```
- 컴파일 오류의 예
```kotlin
// 컴파일 오류
println(swap(s="Hello",2,from=1))
println(swap(1,2,s="Hello"))
```

- 오버로딩
  - 옳은 예(함수 파라미터가 다름)
    ```kotlin
    fun readInt() = readLine()!!.toInt()
    fun readInt(radix:Int) = readLine()!!.toInt(radix)
    ```
  - 잘못된 예(반환 값만 다를 때)
    ```kotlin
    fun plus(a: String, b: String) = a+b
    fun plus(a: String, b: String) = a.toInt()+b.toInt()
    ```

- 가변인자(vararg)
  - 활용 예
  ```kotlin
  fun printSorted(vararg items: Int){
    items.sort()
    println(items.contentToString());
  }  
  printSorted(19,8,11,10)
  ```
  - 배열을 가변인자로 넘길 때 '*'(spread 연산)을 쓴다.<br>
    => 단, 그 배열은 복사가 되어 넘어간다.
  ```kotlin
  val nums = intArrayOf(8,2,7,1)
  printSorted(*nums)
  ```
- 파라미터를 넘길 때, 참조값만 넘어간다.