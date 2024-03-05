package programmers.basic.Day17.숫자찾기

class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = num.toString().indexOf(k.toString())+1
        if(answer == 0) return -1
        return answer
    }
}