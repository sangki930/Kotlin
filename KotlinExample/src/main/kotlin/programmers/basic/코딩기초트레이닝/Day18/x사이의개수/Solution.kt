package programmers.basic.코딩기초트레이닝.Day18.x사이의개수

class Solution {
    fun solution(myString: String): IntArray = myString.split("x").map { it.length }.toIntArray()
}