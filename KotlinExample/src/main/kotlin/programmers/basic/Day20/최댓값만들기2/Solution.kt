package programmers.basic.Day20.최댓값만들기2

import java.util.*
import kotlin.math.max


internal class Solution {
    fun solution(numbers: IntArray): Int {
        var answer = 0
        Arrays.sort(numbers)
        answer = max(
            (numbers[0] * numbers[1]).toDouble(),
            (numbers[numbers.size - 1] * numbers[numbers.size - 2]).toDouble()
        )
            .toInt()
        return answer
    }
}