package programmers.basic.코딩기초트레이닝.Day22.부분문자열인지확인하기

class Solution {
    fun solution(my_string: String, target: String): Int {
        return if(my_string.contains(target)) 1 else 0
    }
}