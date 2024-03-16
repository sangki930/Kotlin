package programmers.basic.Day24.k의개수

class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        return (i..j).map { it.toString().count() { w-> w==k.digitToChar()} }.sum()
    }
}