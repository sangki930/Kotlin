package programmers.basic.Day04.피자나눠먹기._02

class Solution01 {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for(i in 1..100){
            val t=n*i
            if(t%6==0){
                return (t/6)
            }
        }
        return answer
    }
}