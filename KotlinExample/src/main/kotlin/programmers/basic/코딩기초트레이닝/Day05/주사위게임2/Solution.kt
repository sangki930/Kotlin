package programmers.basic.코딩기초트레이닝.Day05.주사위게임2

class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        val _set = intArrayOf(a, b, c).toSet()
        return when {
            _set.size == 3 -> a + b + c
            _set.size == 2 -> (a + b + c) * (a * a + b * b + c * c)
            _set.size == 1 -> (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c)
            else -> -1
        }
    }
}