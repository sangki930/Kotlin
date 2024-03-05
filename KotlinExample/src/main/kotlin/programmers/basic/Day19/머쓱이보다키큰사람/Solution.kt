package programmers.basic.Day19.머쓱이보다키큰사람

class Solution {
    fun solution(array: IntArray, height: Int): Int {
        return array.filter { it > height }.count()
    }
}