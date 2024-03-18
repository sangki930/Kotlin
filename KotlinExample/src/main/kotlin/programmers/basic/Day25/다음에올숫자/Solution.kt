package programmers.basic.Day25.다음에올숫자

class Solution {
    fun solution(common: IntArray): Int {
        var answer = 0
        answer = if (common[2] - common[1] == common[1] - common[0]) {
            common[common.size - 1] + (common[2] - common[1])
        } else {
            common[common.size - 1] * (common[2] / common[1])
        }
        return answer
    }
}