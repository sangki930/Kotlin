package kotlinexample.specialfunctionexample


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

