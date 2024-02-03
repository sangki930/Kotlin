package programmers.basic.코딩기초트레이닝.Day05.등차수열의특정한항만더하기

class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        for(n in 0 until included.size){
            if(included[n]){
                answer+= a + d*n
            }
        }
        return answer
    }
}