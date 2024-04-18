package programmers.basic.코딩기초트레이닝.Day21.뒤에서5등위로

class Solution {
    fun solution(num_list: IntArray): IntArray {
        return num_list.sorted().subList(5,num_list.size).toIntArray()
    }
}