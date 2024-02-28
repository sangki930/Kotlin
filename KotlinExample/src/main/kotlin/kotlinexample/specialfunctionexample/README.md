## 특수함수

---
1. run
- 확장 람다를 받는 확장 함수이며 람다의 결과를 돌려준다.
- 결과의 타입이 Unit일 수도 있음

```kotlin
class Address {

    var zipCode: Int = 0
    var city: String = ""
    var street: String = ""
    var house: String = ""

    constructor()

    constructor(city: String, street: String, house: String) {
        this.city = city
        this.street = street
        this.house = house
    }

    fun post(message: String):Boolean{
        "Message for {$zipCode, $city, $street, $house}"
        return readLine() == "OK"
    }

}


fun main(){
    val isReceived = Address().run{
        zipCode = 123456
        city = "London"
        street = "Baker Street"
        house = "221b"
        post("Hello")

    }

    if(!isReceived){
        println("Message is not delivered")
    }
}
```

2. with
- run()과 유사하나, with()가 확장 함수 타입이 아니므로
문맥 식을 with의 첫 번째 인자로 전달해야 한다.


```kotlin

fun main(args: Array<String>) {

    val message = with (Address("서울","을지로","23")){
        "Address: $city, $street, $house"
    }
    println(message)
}
```

3. let

- 확장 함수 타입의 람다를 받지 않고, 인자가 하나 뿐인
함수 타입의 람다를 받는다는 점이 다르다.
- let의 반환값은 람다가 반환하는 값과 같다.
- 외부 영역에 새로운 변수를 도입하는 일을 피하고 싶을 때 주로 이용한다.

```kotlin

class Address(val city: String, val street: String, val house: String){
    fun post(message: String){
        println("message: $message")
        println("city: $city, street: $street, house: $house")
    }
}

fun main(){
    Address("서울","여의도로","65번지").let{
        println("To city : ${it.city}")
        it.post("Hello")
    }

    Address("서울","여의도로","65번지").let{ addr ->
        println("To city : ${addr.city}")
        addr.post("Hello")
    }
}

```

4. apply

- 확장 람다를 받는 확장 함수이며 자신의 수신 객체를 반환
- 일반적으로 반환값을 만들어내지 않고 객체의 상태를 설정하는 경우에 사용한다.

```kotlin
class Address{
    var city:String?=""
    var street:String?=""
    var house:String?=""

    fun post(message: String){
        println("message: $message")
        println("city: $city, street: $street, house: $house")
    }
}

fun main(){
    val message = readLine()?:return
    Address().apply {
        city = "부산"
        street = "경부고속도로"
        house = "23-2"
    }.post(message)
}
```

5. also

- apply()와 유사
- 인자가 하나 있는 람다를 파라미터로 받는다.

```kotlin
class Address{
    var city:String?=""
    var street:String?=""
    var house:String?=""

    fun post(message: String){
        println("message: $message")
        println("city: $city, street: $street, house: $house")
    }
}

fun main(){
    val message = readLine()?:return

    Address().also {
        it.city = "부산"
        it.street = "경부고속도로"
        it.house = "23-2"
    }.post(message)
}
```