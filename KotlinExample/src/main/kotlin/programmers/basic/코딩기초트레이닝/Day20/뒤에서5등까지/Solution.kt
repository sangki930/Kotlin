package programmers.basic.코딩기초트레이닝.Day20.뒤에서5등까지

class Solution {
    fun solution(num_list: IntArray): IntArray {
        return num_list.sorted().subList(0, 5).toIntArray()
    }
}