package programmers.basic.Day18.문자열정렬하기2

class Solution {
    fun solution(my_string: String): String {
        return my_string.toList().sorted().joinToString("")
    }
}