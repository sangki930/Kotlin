package programmers.basic.코딩기초트레이닝.Day05.이어붙인수

class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var b = ""
        var c = ""
        for(n in num_list){
            if(n%2==0){
                b+=n
            }else{
                c+=n
            }
        }
        return b.toInt()+c.toInt()
    }
}