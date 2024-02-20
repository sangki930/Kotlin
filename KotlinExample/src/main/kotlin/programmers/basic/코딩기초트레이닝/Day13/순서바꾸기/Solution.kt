package programmers.basic.코딩기초트레이닝.Day13.순서바꾸기

class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        return num_list.copyOfRange(n,num_list.size) + num_list.copyOfRange(0,n)
    }
}