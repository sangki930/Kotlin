package programmers.basic.코딩기초트레이닝.Day24.특별한이차원배열1

class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer: Array<IntArray> = Array(n,{IntArray(n,{0})})
        for(i in 0 until n) {
            answer[i][i] = 1
        }
        return answer
    }
}