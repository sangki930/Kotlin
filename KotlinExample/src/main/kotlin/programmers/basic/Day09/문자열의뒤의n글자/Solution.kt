package programmers.basic.Day09.문자열의뒤의n글자

class Solution {
    fun solution(my_string: String, n: Int): String = my_string.substring(my_string.length-n,my_string.length)
}