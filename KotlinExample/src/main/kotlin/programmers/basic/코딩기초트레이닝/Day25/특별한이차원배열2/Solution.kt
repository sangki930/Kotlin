package programmers.basic.코딩기초트레이닝.Day25.특별한이차원배열2

class Solution {
    fun solution(arr: Array<IntArray>): Int {
        var answer: Int = 1
        var n = arr.size
        for(i in 0 until n) {
            for (j in i + 1 until n) {
                if (arr[i][j] != arr[j][i]) return 0;
            }
        }
        return answer
    }
}