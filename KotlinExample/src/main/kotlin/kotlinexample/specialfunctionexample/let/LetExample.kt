package kotlinexample.specialfunctionexample.let

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