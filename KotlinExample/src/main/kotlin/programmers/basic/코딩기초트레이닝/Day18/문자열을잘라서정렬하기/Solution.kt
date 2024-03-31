package programmers.basic.코딩기초트레이닝.Day18.문자열을잘라서정렬하기

class Solution {
    fun solution(myString: String): Array<String> = myString.split("x").filter { it.isNotEmpty() }.sorted().toTypedArray()
}