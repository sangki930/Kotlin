package programmers.basic.코딩기초트레이닝.Day08.글자이어붙여문자열만들기

class Solution1 {
    fun solution(my_string: String, index_list: IntArray): String {
        var answer: String = ""
        return index_list.map { my_string[it] }.joinToString("")
    }
}