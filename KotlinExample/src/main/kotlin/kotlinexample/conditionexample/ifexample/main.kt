package kotlinexample.conditionexample.ifexample

fun main(){
    val s = readLine()!!
    val i = s.indexOf("/")

    // 코틀린은 Java와 달리 if를 식으로 사용할 수 있다.

    // 10/3 같은 문자열을 /를 기준으로 10과 3으로 나눠서 나눗셈을 수행한다.
    val result = if(i>=0){
        val a = s.substring(0,i).toInt()
        val b = s.substring(i+1).toInt()
        (a/b).toString()
    } else "NONE"

    println(result)
}