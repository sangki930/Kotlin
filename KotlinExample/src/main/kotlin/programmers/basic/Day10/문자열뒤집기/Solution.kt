package programmers.basic.Day10.문자열뒤집기

class Solution {
    fun solution(my_string: String, s: Int, e: Int): String = my_string.slice(0 until s) + my_string.slice(s .. e).reversed() + my_string.slice(e+1 until my_string.length)
}