package programmers.basic.코딩기초트레이닝.Day04.n의배수

class Solution {
    fun solution(num: Int, n: Int): Int {
        return when{
            num%n==0 -> 1
            else -> 0
        }
    }
}