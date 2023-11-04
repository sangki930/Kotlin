## 코틀린 기초

---

- 콘솔출력(println)<br>
```kotlin
fun kotlinexample.packageexample.main(){
  println("Hello World") 
}
```

- val

  - 불변변수 역할
  ```kotlin
    val a = readLine()!!.toInt() // a를 입력받고 Int로 전환
    val b = readLine()!!.toInt() // b를 입력받고 Int로 전환
    println(a+b)
    ```
  - 필요시 타입 명시도 가능
  ```kotlin
    val n: Int = 100 // Integer 형
    val text: String = "Hello!" // 문자열
    ```
- 논리연산자
```kotlin
// ! : 논리 부정 
// or, and, xor => 즉시 계산(eager) 방식의 논리합
// ||, &&  => 지연 계산(lazy) 방식의 논리합, 논리곱

println(true or false)
println(1==1 || 2>3)

```
- 문자
  
  - Char에 대한 연산은 두 문자의 차이는 제외하고 Char형으로 반환

  ```kotlin
      var a = 'a'
      var h = 'h'
    
      println(a+5) // f
      println(a-5) // \
      println(h-a) // 7
      println(--h) // g
      println(++a) //b
  ```
- 문자열

  - 문자열 append
  ```kotlin
    var s1 = "Hello!"
    var s2 = s1+"World!!"
    println(s2)
  ```
  - 템플릿
  ```kotlin
    val name = readLine()
    println("Hello, $name!\n Today is ${Date()}")
    println("Hello, $name!\n Today is ${LocalDate.now()}")
    
    val message = """
        Hello, $name!
        Today is ${Date()}
    """.trimIndent()
    // trimIndent() : 여러 줄에 공통된 최소 들여쓰기 제거
  ```
  - 기본 문자열 연산
  ```kotlin
    var s = "Hello!"

    println(s.length) // 6
    println(s.lastIndex) // 5(첫 번째 문자의 인덱스가 0이므로)

    println(s[0]) // H
    println(s[1]) // e
    println(s[5]) // !
    // println(s[10]) // 에러(잘못된 인덱스), StringIndexOutOfBoundsException
  ```
  - 문자열 동등비교
  ```kotlin
    val s3 = "Hello!"
    val s4 = "Hel"+"lo!"
    println(s3==s4) // true
    // 이는 println(s1.equals(s2))와 같다.
    // Java와는 다르게 코틀린에서는 ==가 기본적으로 equals()호출한다.
    
    // Java의 ==,!=와 동등하게 쓸려면, 각각 ===,!== 연산자를 사용하면된다.
    println(s3===s4) // false
  ```
  - 주요함수
    - isEmpty, isNotEmpty : 문자열이 비어있는 지 아닌지
    ```kotlin
    println("Hello".isEmpty()) // false
    println("".isEmpty()) // true
    println("Hello".isNotEmpty()) // true
    ```
    - substring : 부분문자열 추출
    ```kotlin
    println("Hello".substring(2)) // "llo"
    println("Hello".substring(1,3)) "el"
    ```
    - startsWith, endsWith : 접미사 또는 접두사인지
    ```kotlin
    println("Hello".startsWith("Hel"))
    println("Hello".endsWith("lo"))
    ```
    - indexOf : 인자로 받은 문자나 문자열이 수신 객체인 문자열에 나타나는 첫 번째 인덱스 반환
    ```kotlin
    // 맨 앞부터
    println("abcabc".indexOf('b'))
    println("abcabc".indexOf("cd"))
    println("abcabc".indexOf("ca"))

    // 주어진 인덱스부터 찾기
    println("abcabc".indexOf('b',2))
    println("abcabc".indexOf("ab",2))
    ```
- 비트연산
  - 왼쪽 시프트
  ```kotlin
  println(13 shl 2)
  println((-13) shl 2)
  ```
  - 오른쪽 시프트
  ```kotlin
  println(13 shr 2)
  println((-13) shr 2)
  ```
  - 부호없는 오른쪽 시프트
  ```kotlin
  println(13 ushr 2)
  println((-13) ushr 2)
  ```
  - 비트 and 연산
  ```kotlin
  println(13 and 19)
  println(-13 and 19)
  ```
  - 비트 or 연산
  ```kotlin
  println(13 or 19)
  println(-13 or 19)
  ```
  - 비트 xor 연산
  ```kotlin
  println(13 xor 19)
  println(-13 xor 19)
  ```
  - 비트 반전
  ```kotlin
  println(13.inv())
  println((-13).toInt())
  ```
- 배열
  - 기본 
  ```kotlin
  // 배열을 선언하는 함수는 Generic함
  val a = emptyArray<String>() // Array<String> (원소 0개)
  val b = arrayOf("My Name","AAA")   // Array<String> (원소 2개)
  val c = arrayOf(1,4,9) // Array<Int> (원소 3개)
  ```
  - 입력방법
  ```kotlin
  val size = readLine()!!.toInt()
  val squares = Array(size){(it+1)*(it+1)} // 여기서 {}가 들어간 것을 람다(lambda)라고 함
  ```
  - 배열 기본 연산
  ```kotlin
  val arr = arrayOf(1,4,9,16)
  println(arr.size)
  println(arr.lastIndex)
  println(arr[3])
  println(arr[1])

  arr[2] = 100
  println(arr.contentToString())
  arr[3]+=9
  println(arr.contentToString())
  arr[0]--;
  println(arr.contentToString())
  ```