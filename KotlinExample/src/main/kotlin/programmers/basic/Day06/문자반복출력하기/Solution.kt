package programmers.basic.Day06.문자반복출력하기

class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        for(i in my_string)
            for(j in 1..n)
                answer+=i
        return answer
    }

//    fun solution(myString: String, n: Int) = myString.map { it.toString().repeat(n) }.joinToString("");
}