package programmers.basic.Day03.최빈값구하기

class Solution {
    fun solution(array: IntArray) = array.groupBy { it }
        .entries
        .sortedByDescending { (key, value) -> value.size }
        .let {
            if (it.size > 1 && it[0].value.size == it[1].value.size) -1 else it[0].key
        }
}