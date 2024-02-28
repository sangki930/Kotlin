package kotlinexample.packageexample

import getInt
import kotlinexample.conditionexample.ifexample.max

fun main(){
    println(getInt(7));

    //val (a, age) = Person("abc","def",3)
   // println(a)

    val p = Person("abc","def",3)

    val lessThan = { a : Int, b : Int -> a<b }
    lessThan(1,2)
    val f: (Int,Int) -> Int = ::max

    val p1 = Person("abc","def",3)
    val p2 = Person("abc","def",3)
    val p3 = p1
    println(p1==p2)
    println(p1==p3)

    val box1 = Mailbox("XXX", Person("박","상기",88))
    val box2 = Mailbox("XXX",Person("박","상기",88))

}

data class Mailbox(val address:String, val person:Person)
class Person(val firstName: String, val lastName: String, val age: Int)
