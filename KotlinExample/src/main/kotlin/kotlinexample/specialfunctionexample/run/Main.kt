package kotlinexample.specialfunctionexample.run

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