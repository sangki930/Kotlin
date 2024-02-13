package programmers.basic.Day11.가까운1찾기

class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        var answer: Int = 0
        return arr.indexOfFirst { it>idx }
    }
}