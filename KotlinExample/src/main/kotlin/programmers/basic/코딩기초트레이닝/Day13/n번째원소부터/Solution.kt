package programmers.basic.코딩기초트레이닝.Day13.n번째원소부터

class Solution {
    fun solution(numList: IntArray, n: Int) = numList.copyOfRange(n - 1, numList.size)
}