package programmers.basic.Day11.카운트다운

class Solution {
    fun solution(start: Int, end_num: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in start downTo end_num) answer +=i
        return answer
    }
}