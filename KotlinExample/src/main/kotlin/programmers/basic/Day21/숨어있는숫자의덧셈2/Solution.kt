package programmers.basic.Day21.숨어있는숫자의덧셈2

class Solution {
    fun solution(my_string: String): Int {

        return my_string.map { if(!it.isDigit()) ';' else it }.joinToString("").split(";").filter { it != "" }.map { it.toInt() }.sum()
    }
}