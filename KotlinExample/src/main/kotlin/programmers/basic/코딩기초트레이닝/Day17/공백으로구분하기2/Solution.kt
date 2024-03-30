package programmers.basic.코딩기초트레이닝.Day17.공백으로구분하기2

class Solution {
    fun solution(my_string: String): Array<String> = my_string.split(" ").filter { it.isNotBlank() }.toTypedArray()
}