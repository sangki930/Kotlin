package programmers.basic.Day25.연속된수의합

internal class Solution {
    fun solution(num: Int, total: Int): IntArray {
        val answer = IntArray(num)
        if (num % 2 == 0) {
            // 중앙값 : total/num
            for (i in 0 until num) {
                answer[i] = total / num - num / 2 + i + 1
            }
        } else if (num % 2 == 1) {
            for (i in total / num - (num / 2)..total / num + (num / 2)) {
                answer[i - (total / num - (num / 2))] = i
            }
        }
        return answer
    }
}