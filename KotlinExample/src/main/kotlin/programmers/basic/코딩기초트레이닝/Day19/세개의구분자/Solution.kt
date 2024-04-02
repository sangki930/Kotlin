package programmers.basic.코딩기초트레이닝.Day19.세개의구분자


class Solution {
    fun solution(myStr: String): List<String> {
        return myStr.split("[abc]+".toRegex()).filter(String::isNotEmpty).let { it.ifEmpty { listOf("EMPTY") } }
    }
}