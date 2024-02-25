package programmers.basic.Day12.숨어있는숫자의덧셈1

class Solution {
    fun solution(my_string: String): Int {
        return my_string.filter{Character.isDigit(it)}.map { it.digitToInt() }.toList().sum()
    }
}