package programmers.basic.코딩기초트레이닝.Day23.정수찾기

class Solution {
    fun solution(num_list: IntArray, n: Int): Int {
        return if(num_list.contains(n)) 1 else 0
    }
}