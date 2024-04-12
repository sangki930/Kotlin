package programmers.basic.코딩기초트레이닝.Day19.무작위로K개의수뽑기

class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = IntArray(k, {-1})
        var j = 0
        for(i in arr) {
            if(j>=k) continue
            if(!answer.contains(i)) {
                answer[j++] = i
            }
        }
        return answer
    }
}