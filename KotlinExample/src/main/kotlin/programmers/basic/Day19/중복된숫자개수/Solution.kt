package programmers.basic.Day19.중복된숫자개수

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        val arr = IntArray(1001)
        for (i in array) arr[i]++
        return arr[n]
    }
}