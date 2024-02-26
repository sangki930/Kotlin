package programmers.basic.Day13.n번째원소부터

class Solution {
    fun solution(numList: IntArray, n: Int) = numList.copyOfRange(n - 1, numList.size)
}