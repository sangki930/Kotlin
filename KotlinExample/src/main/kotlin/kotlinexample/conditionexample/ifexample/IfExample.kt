package kotlinexample.conditionexample.ifexample

// 최댓값을 고르는 함수 정의(정석)
fun max(a:Int, b:Int):Int{
    if(a>b) return a
    else return b
}


fun maxAnother(a:Int,b:Int) = if (a>b) a else b

