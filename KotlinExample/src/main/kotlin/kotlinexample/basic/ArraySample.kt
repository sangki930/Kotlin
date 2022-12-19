package kotlinexample.basic

import java.util.*

// 코틀린에서의 배열
fun main(){
    // 배열을 선언하는 함수는 Generic함
    val a = emptyArray<String>() // Array<String> (원소 0개)
    val b = arrayOf("My Name","AAA")   // Array<String> (원소 2개)
    val c = arrayOf(1,4,9) // Array<Int> (원소 3개)

    // 입력방법
//    val size = readLine()!!.toInt()
//    val squares = Array(size){(it+1)*(it+1)} // 여기서 {}가 들어간 것을 람다(lambda)라고 함

    val operations = charArrayOf('+','-','*','/','%')

    // 배열 기본 연산
    val arr = arrayOf(1,4,9,16)
    println(arr.size)
    println(arr.lastIndex)
    println(arr[3])
    println(arr[1])

    arr[2] = 100
    println(arr.contentToString())
    arr[3]+=9
    println(arr.contentToString())
    arr[0]--;
    println(arr.contentToString())

    // 자바와 마찬가지로 배열 타입 변수 자체에는 실제 데이터에 대한 참조를 저장
    
    val numbers = arr
    numbers[0] = 1000
    println(arr.contentToString())
    println(numbers.contentToString())
    
    // 원본과 별도로 배열을 생성하고 싶다면 copyOf() 함수를 사용한다.
    val nums = arr.copyOf()
    nums[0] = 10000
    println(nums.copyOf(2).contentToString()) // 뒤가 잘림
    println(nums.copyOf(5).contentToString()) // 부족한 부분에 0이 채워짐
    
    // 배열을 생성하고 나면 길이는 바꿀 수 없지만, + 연산을 사용해 원소를 추가한 새로운 배열을 만들 수 있음
    val d = intArrayOf(1,2,3)+4
    val e = intArrayOf(1,2,3)+ intArrayOf(5,6)

    print(d.contentEquals(e)) // 배열 내용을 비교하고 싶을 때, contentEqual

    val f = intArrayOf(1,2,3,4,5)

    println(f.isEmpty()) // 원소가 비어있는 지 검사
    println(f.isNotEmpty()) // 원소가 있는 지 검사
    println(f.indexOf(23)) // 인자와 일치하는 최초의 배열 아이템의 인덱스 반환, 존재하지 않으면 -1 반환

}