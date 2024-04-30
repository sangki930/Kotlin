package programmers.basic.코딩기초트레이닝.Day25.정사각형으로만들기

import kotlin.math.*
class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        var n = max(arr.size,arr[0].size)
        var answer: Array<IntArray> = Array(n) { IntArray(n) {0} }
        for(i in 0 until arr.size) {
            for(j in 0 until arr[0].size) {
                answer[i][j] = arr[i][j]
            }
        }
        return answer
    }
}