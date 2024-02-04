package programmers.basic.코딩기초트레이닝.Day06.수열과구간쿼리2

class Solution1 {
    fun solution(arr: IntArray, queries: Array<IntArray>): List<Int> {
        return queries.map { q ->
            val min = arr.sliceArray(q[0]..q[1]).filter { it > q[2] }.minOrNull() ?: -1
            return@map if (min == Int.MAX_VALUE) -1 else min
        }
    }
}