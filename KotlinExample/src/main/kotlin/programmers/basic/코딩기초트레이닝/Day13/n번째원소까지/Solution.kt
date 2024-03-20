package programmers.basic.코딩기초트레이닝.Day13.n번째원소까지

class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        return num_list.sliceArray(0..n-1)
    }
}