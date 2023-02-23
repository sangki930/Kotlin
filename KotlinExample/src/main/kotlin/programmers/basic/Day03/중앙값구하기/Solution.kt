package programmers.basic.Day03.중앙값구하기

class Solution {
    fun solution(array: IntArray): Int = array.sorted().toIntArray()[array.size/2]
}