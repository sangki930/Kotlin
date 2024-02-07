package programmers.basic.코딩기초트레이닝.Day07.클라츠수열만들기

class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var x = n
        while(true){
            if(x%2==0){
                answer+=x;
                x/=2
            }else{
                answer+=x;
                x = 3*x+1
            }
            if(x==1) {
                answer+=x
                break
            }
        }
        return answer
    }
}