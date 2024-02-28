package kotlinexample.specialfunctionexample.test

import java.util.*

fun main(){
    var s1 = Student()
    s1.name = "참새"
    s1.displayInfo()
    println("======================")
    s1.age = 10
    s1.displayInfo()


    val lazyFoo = lazy{
        100
    }
    println(lazyFoo)
    val foo by lazyFoo
    println(foo) // use foo variable (initialize lazyFoo)
    if (lazyFoo.isInitialized()) {
        println(foo)
    }

    var kors = arrayOf(90, 94, 96)
    for(kor in kors.withIndex()) {
        println("번째 국어 점수는 ${kor}입니다")
    }
    var m = mutableMapOf(1 to 3)
    var arr = arrayOf(1,2,3,)
    
}

class Student {
    lateinit var name:String
    var age:Int = 0
    val address: String by lazy {

        "abcd"
    }

    fun displayInfo() {
        println("이름은: ${name} 입니다.")
        println("나이는: ${age} 입니다.")
        println("주소는: ${address} 입니다.")
    }
}