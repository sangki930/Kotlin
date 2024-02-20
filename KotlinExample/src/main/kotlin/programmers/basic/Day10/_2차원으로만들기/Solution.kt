package programmers.basic.Day10._2차원으로만들기

class Solution {
    fun solution(numList: IntArray, n: Int): Array<IntArray> {
        val answer = Array(numList.size / n) { IntArray(n) }
        var count = 0

        for (i in answer.indices) {
            for (j in answer[i].indices) {
                answer[i][j] = numList[count]
                count++
            }
        }
        return answer
    }
}