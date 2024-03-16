package programmers.basic.Day23.등수매기기


internal class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        val scoreList: MutableList<Int> = ArrayList()
        for (t in score) {
            scoreList.add(t[0] + t[1])
        }
        scoreList.sortWith(Comparator.reverseOrder())

        val answer = IntArray(score.size)
        for (i in score.indices) {
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1
        }
        return answer
    }
}