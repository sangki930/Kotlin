package programmers.basic.Day21.삼각형의결정조건2

import java.util.*

class Solution {
    fun solution(sides: IntArray): Int {
        var answer = 0
        Arrays.sort(sides)
        val max = sides[1]
        val min = sides[0]
        val low_range = max - min
        val high_range = max + min
        answer = high_range - low_range - 1

        return answer
    }
}