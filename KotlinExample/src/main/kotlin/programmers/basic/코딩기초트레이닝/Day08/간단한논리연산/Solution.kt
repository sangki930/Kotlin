package programmers.basic.코딩기초트레이닝.Day08.간단한논리연산

class Solution {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {
        return (x1 || x2) && (x3 || x4)
    }
}