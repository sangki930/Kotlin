package programmers.basic.코딩기초트레이닝.Day04.flag에따라다른값변환하기

class Solution {
    fun solution(a: Int, b: Int, flag: Boolean): Int {
        return if(flag) a+b else a-b
    }
}