package programmers.basic.코딩기초트레이닝.Day23.꼬리문자열

class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        return str_list.filter { !it.contains(ex) }.joinToString("")
    }
}