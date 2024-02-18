package programmers.basic.코딩기초트레이닝.Day10.접두사인지확인하기

class Solution {
    fun solution(my_string: String, is_prefix: String): Int = if(my_string.startsWith(is_prefix)) 1 else 0
}