package programmers.basic.Day18.문자열안에문자열

class Solution {
    fun solution(str1: String, str2: String): Int {
        return if (str1.contains(str2)) 1 else 2
    }
}