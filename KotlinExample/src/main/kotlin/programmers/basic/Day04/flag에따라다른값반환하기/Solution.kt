package programmers.basic.Day04.flag에따라다른값반환하기

class Solution {
    fun solution(a: Int, b: Int, flag: Boolean): Int {
        return if(flag) a+b else a-b
    }
}