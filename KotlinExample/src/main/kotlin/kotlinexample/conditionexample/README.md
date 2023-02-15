## IF문

---

- IF문 사용예<br>
```kotlin
// 최댓값을 고르는 함수 정의(정석)
fun max(a:Int, b:Int):Int{
    if(a>b) return a
    else return b
}

fun maxAnother(a:Int,b:Int) = if (a>b) a else b
```

- Java와의 차이점은 if문을 간단히, 그리고 식으로써 활용 가능

    - 불변변수 역할
  ```kotlin
    package kotlinexample.conditionexample.ifexample

    fun main(){
    val s = readLine()!!
    val i = s.indexOf("/")
    
        // 코틀린은 Java와 달리 if를 식으로 사용할 수 있다.
        
        // 10/3 같은 문자열을 /를 기준으로 10과 3으로 나눠서 나눗셈을 수행한다.
        val result = if(i>=0){
            val a = s.substring(0,i).toInt()
            val b = s.substring(i+1).toInt()
            (a/b).toString()
        } else "NONE"
        
        println(result)
    }
  ```
