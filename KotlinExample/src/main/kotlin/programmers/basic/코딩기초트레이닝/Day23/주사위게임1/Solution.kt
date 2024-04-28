package programmers.basic.코딩기초트레이닝.Day23.주사위게임1

class Solution {
    fun solution(a: Int, b: Int): Int {
        return if(a%2==1 && b%2==1){
            a*a+b*b
        }else if(a%2==1 || b%2==1){
            2*(a+b)
        }else{
            Math.abs(a-b)
        }
    }
}