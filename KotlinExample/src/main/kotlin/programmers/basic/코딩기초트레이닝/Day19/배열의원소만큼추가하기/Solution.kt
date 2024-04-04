package programmers.basic.코딩기초트레이닝.Day19.배열의원소만큼추가하기

class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in arr){
            for(j in 0 until i){
                answer += i
            }
        }
        return answer
    }
}