package programmers.basic.코딩기초트레이닝.Day09.배열만들기5

class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(str in intStrs){
            var t = str.substring(s,s+l).toInt()
            if(t>k) answer += t
        }
        return answer
    }
}