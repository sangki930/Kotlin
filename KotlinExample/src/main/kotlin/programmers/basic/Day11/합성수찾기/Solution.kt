package programmers.basic.Day11.합성수찾기

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for(i in 2..n){
            if(judge(i)) answer++
        }
        return answer
    }

    fun judge(n : Int): Boolean{
        if(n==1) return true;
        for(i in 2..Math.sqrt(n.toDouble()).toInt()){
            if(n%i==0) return true;
        }
        return false;
    }
}