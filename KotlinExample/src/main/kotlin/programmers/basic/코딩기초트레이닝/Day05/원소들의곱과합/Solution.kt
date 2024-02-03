package programmers.basic.코딩기초트레이닝.Day05.원소들의곱과합

class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var b = 1
        var c = 0
        for(n in num_list){
            b *= n
            c += n
        }

        return if(b<c*c){
            1
        }else if(b>c*c){
            0
        }else{
            -1
        }
    }
}