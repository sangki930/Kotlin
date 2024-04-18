package programmers.basic.코딩기초트레이닝.Day21.문자열정수의합

class Solution {
    fun solution(num_str: String): Int {
        return num_str.map { it.digitToInt() }.sum()
    }
}