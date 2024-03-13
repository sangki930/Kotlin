package programmers.basic.Day22.저주의숫자3

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 1
        for(i in 1..n){
            while(answer%3==0 || (answer.toString()).contains("3")) answer++
            answer++
        }
        return answer-1
    }
}