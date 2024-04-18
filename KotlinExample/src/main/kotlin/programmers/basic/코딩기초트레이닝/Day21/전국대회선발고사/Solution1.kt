package programmers.basic.코딩기초트레이닝.Day21.전국대회선발고사

class Solution1 {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        val result = rank.mapIndexed { i, v -> i to v }
            .filter { attendance[it.first] }
            .sortedBy { it.second }
        return result[0].first * 10000 + result[1].first * 100 + result[2].first
    }
}