package programmers.basic.Day22.평행

class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val x1 = dots[0][0]
        val y1 = dots[0][1]
        val x2 = dots[1][0]
        val y2 = dots[1][1]
        val x3 = dots[2][0]
        val y3 = dots[2][1]
        val x4 = dots[3][0]
        val y4 = dots[3][1]
        var answer = 0

        var slope1 = (y2 - y1).toDouble() / (x2 - x1)
        var slope2 = (y4 - y3).toDouble() / (x4 - x3)
        if (slope1 == slope2) answer = 1

        slope1 = (y3 - y1).toDouble() / (x3 - x1)
        slope2 = (y2 - y4).toDouble() / (x2 - x4)
        if (slope1 == slope2) answer = 1

        slope1 = (y4 - y1).toDouble() / (x4 - x1)
        slope2 = (y2 - y3).toDouble() / (x2 - x3)
        if (slope1 == slope2) answer = 1

        return answer
    }
}