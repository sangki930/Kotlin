package programmers.basic.Day12.리스트자르기

class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        val (a,b,c) = slicer
        return when (n) {
            1 -> num_list.slice(0..b)
            2 -> num_list.slice(a..num_list.lastIndex)
            3 -> num_list.slice(a..b)
            else -> (a..b step c).map { num_list[it] }
        }.toIntArray()
    }
}