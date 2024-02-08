package programmers.basic.코딩기초트레이닝.Day09.배열만들기5

class Solution1 {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intArrayOf()
        return intStrs.map { it.slice(s..(s+l-1)).toInt() }.filter { it > k }.toIntArray()
    }
}