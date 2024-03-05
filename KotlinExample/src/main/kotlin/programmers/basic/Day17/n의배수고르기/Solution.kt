package programmers.basic.Day17.n의배수고르기

class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray
    = numlist.filter { it % n ==0 }.toIntArray()
}