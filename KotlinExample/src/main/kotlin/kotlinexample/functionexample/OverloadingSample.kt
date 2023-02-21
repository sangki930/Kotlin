package kotlinexample.functionexample

// 오버로딩의 예
fun readInt() = readLine()!!.toInt()
fun readInt(radix:Int) = readLine()!!.toInt(radix)

// 아래의 경우는 반환값만 다르기 때문에 컴파일 오류
fun plus(a: String, b: String) = a+b
//fun plus(a: String, b: String) = a.toInt()+b.toInt()

// vararg(가변인자) 활용
fun printSorted(vararg items: Int){
    items.sort()
    println(items.contentToString());
}

fun change(vararg items:IntArray){
    items[0][0] = 100
}

fun main(){
    println(readInt())

    // 1. 파라미터의 개수와 타입을 기준으로 호출할 수 있는 모든 함수를 찾는다.
    // 2. 덜 구체적인 함수를 제외시킨다. 규칙 1에서 선택한 후보 목록에서 어떤 함수의 파라미터
    // 타입이 다른 함수의 파라미터 타입의 상위 타입인 경우 이 함수는 다른 함수보다 덜 구체적인 함수이다.
    // 3. 후보가 하나로 압축되면 이 함수가 호출할 함수다. 후보가 둘 이상이면 컴파일 오류가 발생한다.

    // vararg example
    printSorted(19,8,11,10)

    // 배열을 사용해 가변인자로 넘길 때 spread연산 '*'을 쓴다.
    // 단, 스프레드연산을 적용한 배열은 복사가 된다
    val nums = intArrayOf(8,2,7,1)
    printSorted(*nums)
    // printSorted(nums) // Error : passing IntArray instead of Int

    // 아래의 경우는 얕은(shallow) 복사가 이뤄진다.
    // 배열 내부에 참조값이 들어있는 경우에는 참조가 복사되

    val g = intArrayOf(1,2,3)
    val h = intArrayOf(4,5,6)
    change(g,h)
    println(g.contentToString())
    println(h.contentToString())

}