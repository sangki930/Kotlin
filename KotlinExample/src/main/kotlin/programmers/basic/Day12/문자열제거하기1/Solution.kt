package programmers.basic.Day12.문자열제거하기1

class Solution {
    fun solution(my_string: String): IntArray {
        return my_string.filter { Character.isDigit(it) }.map { it.digitToInt() }.sorted().toIntArray()
    }
}