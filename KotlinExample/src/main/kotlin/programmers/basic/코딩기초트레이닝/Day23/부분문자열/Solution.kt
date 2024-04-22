package programmers.basic.코딩기초트레이닝.Day23.부분문자열

class Solution {
    fun solution(str1: String, str2: String): Int {
        return if(str2.contains(str1)) 1 else 0
    }
}