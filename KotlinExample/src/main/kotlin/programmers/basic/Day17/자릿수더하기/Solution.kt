package programmers.basic.Day17.자릿수더하기

class Solution {
    fun solution(n: Int): Int
            = (n.toString()).map { it.digitToInt() }.sum()
}