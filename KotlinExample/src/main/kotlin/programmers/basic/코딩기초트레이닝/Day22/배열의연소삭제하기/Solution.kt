package programmers.basic.코딩기초트레이닝.Day22.배열의연소삭제하기

class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        return arr.filter { !delete_list.contains(it) }.toIntArray()
    }
}