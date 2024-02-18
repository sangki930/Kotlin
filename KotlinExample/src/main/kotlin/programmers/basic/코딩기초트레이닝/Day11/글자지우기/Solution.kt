package programmers.basic.Day11.글자지우기

class Solution {
    fun solution(my_string: String, indices: IntArray): String
    = my_string.indices.filter{!indices.contains(it)}.map { my_string[it] }.toList().joinToString()
}