package programmers.basic.코딩기초트레이닝.Day07.카운트업

class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in start_num .. end_num) answer += i
        return answer
    }
}