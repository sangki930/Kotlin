package programmers.basic.Day22.겹치는선분의길이

class Solution {
    fun solution(lines: Array<IntArray>): Int {
        val rail = IntArray(200)
        for (line in lines) {
            for (j in (line[0] + 100) until (line[1] + 100)) {
                rail[j]++
            }
        }

        var answer = 0
        for (value in rail) {
            if (value > 1) answer++
        }
        return answer
    }
}