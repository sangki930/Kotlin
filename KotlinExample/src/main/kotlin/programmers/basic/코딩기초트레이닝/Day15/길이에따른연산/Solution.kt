package programmers.basic.코딩기초트레이닝.Day15.길이에따른연산

class Solution {
    fun solution(num_list: IntArray): Int {
        return if(num_list.size>10){
            num_list.sum()
        }else num_list.reduce { a, b -> a * b }
    }
}