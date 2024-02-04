package programmers.basic.코딩기초트레이닝.Day06.수열과구간쿼리2

class Solution2 {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        return queries.map { (s,e,k) ->
            arr.slice(s..e).filter { it > k }.minOrNull() ?: -1
        }.toIntArray()
    }
}