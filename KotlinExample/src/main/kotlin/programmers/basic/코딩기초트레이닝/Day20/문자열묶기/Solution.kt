package programmers.basic.코딩기초트레이닝.Day20.문자열묶기

class Solution {
    fun solution(strArr: Array<String>): Int {
        var answer: Int = 0
        var arr = IntArray(3000001)
        for (i in strArr.indices) {
            arr[strArr[i].length]++
        }
        return arr.maxOf { i->i }
    }
}