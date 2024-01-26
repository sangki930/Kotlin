package programmers.basic.Day06.짝수홀수개수

class Solution {
    fun solution(numList: IntArray) = intArrayOf(numList.filter { it % 2 == 0 }.size, numList.filter { it % 2 == 1 }.size)
}