package programmers.basic.코딩기초트레이닝.Day14.n보다커질때까지더하기

class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = 0
        for(number in numbers){
            answer += number
            if(answer>n) break
        }
        return answer
    }
}