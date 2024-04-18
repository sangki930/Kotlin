package programmers.basic.코딩기초트레이닝.Day21.전국대회선발고사

data class Data(val id:Int, val r:Int)

class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        var list = listOf<Data>()
        var rank_new = (0 until rank.size).filter { attendance[it] }
        rank_new.forEach { list += Data(it,rank[it]) }
        list = list.sortedBy { it.r }
        return list[0].id * 10000 + list[1].id * 100 + list[0].id
    }
}