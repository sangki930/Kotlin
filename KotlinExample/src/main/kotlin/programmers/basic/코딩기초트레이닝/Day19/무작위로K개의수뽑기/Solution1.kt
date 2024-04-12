package programmers.basic.코딩기초트레이닝.Day19.무작위로K개의수뽑기

class Solution1 {
    fun solution(arr: IntArray, k: Int): List<Int> {
        return (0 until k).map { if (it >= arr.toSet().size) -1 else arr.distinct()[it] }
    }
}