package programmers.basic.코딩기초트레이닝.Day16.특정한문자를대문자로바꾸기

class Solution {
    fun solution(my_string: String, alp: String): String = my_string.lowercase().replace(alp, alp.uppercase())
}