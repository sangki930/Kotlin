package programmers.basic.Day14.대문자와소문자

class Solution {
    fun solution(my_string: String): String = my_string.map { if(it.isLowerCase()) it.toUpperCase() else it.toLowerCase() }.joinToString("")
}