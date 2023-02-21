package kotlinexample.exeptionhandlingexample

class ExceptionHandling {

    // 예외 던지기(throw)
    fun sayHello(name: String){
        val message = if (name.isNotEmpty()) "Hello, $name"
        else throw IllegalArgumentException("Empty name")
        println(message)
    }

    // 예외 잡기(try - catch)
    fun readInt(default: Int): Int{
        try {
            return readLine()!!.toInt()
        }catch (e: NumberFormatException){
            return default
        }
    }

}