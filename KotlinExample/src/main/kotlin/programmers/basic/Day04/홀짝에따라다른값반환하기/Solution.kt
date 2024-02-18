package programmers.basic.Day04.홀짝에따라다른값반환하기

class Solution {
    fun solution(n: Int): Int {
        return if(n%2==0){
            var answer = 0
            for(i in 1..n){
                if(i%2==0) answer+=i*i
            }
            answer
        }else{
            var answer = 0
            for(i in 1..n){
                if(i%2==1) answer+=i
            }
            answer
        }
    }
}