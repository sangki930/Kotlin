package kotlinexample.specialfunctionexample.also

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