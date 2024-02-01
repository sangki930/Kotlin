package programmers.basic.코딩기초트레이닝.Day04.공배수

class Solution {
    fun solution(number: Int, n: Int, m: Int): Int {
        return when{
            (number%n==0 && number%m==0) -> 1
            else -> 0
        }
    }
}