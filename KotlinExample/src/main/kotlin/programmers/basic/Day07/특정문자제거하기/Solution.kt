package programmers.basic.Day07.특정문자제거하기

class Solution {
    fun solution(my_string: String, letter: String): String {
        var answer: String = my_string.replace(letter,"")
        return answer
    }
}