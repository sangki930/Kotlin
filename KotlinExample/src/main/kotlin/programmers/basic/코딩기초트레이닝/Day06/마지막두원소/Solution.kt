package programmers.basic.코딩기초트레이닝.Day06.마지막두원소

class Solution {
    fun solution(num_list: IntArray): IntArray {
        val last = num_list[num_list.lastIndex]
        val second = num_list[num_list.lastIndex-1]
        return num_list + if (last > second) last - second else last * 2
    }
}