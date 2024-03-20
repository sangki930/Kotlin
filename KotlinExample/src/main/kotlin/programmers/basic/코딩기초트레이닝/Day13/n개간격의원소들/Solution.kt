package programmers.basic.코딩기초트레이닝.Day13.n개간격의원소들

class Solution {
    fun solution(numList: IntArray, n: Int) = (numList.indices step n).map { numList[it] }
}