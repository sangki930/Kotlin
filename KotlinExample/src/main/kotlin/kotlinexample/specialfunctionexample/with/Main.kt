package kotlinexample.specialfunctionexample.with

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

fun main(args: Array<String>) {

    val message = with (Address("서울","을지로","23")){
        "Address: $city, $street, $house"
    }
    println(message)
}