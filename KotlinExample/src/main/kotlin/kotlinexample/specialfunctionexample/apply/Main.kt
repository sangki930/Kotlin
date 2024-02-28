package kotlinexample.specialfunctionexample.apply

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

    try {

    }catch (e: Exception){
        e.printStackTrace()
    }finally {

    }
}