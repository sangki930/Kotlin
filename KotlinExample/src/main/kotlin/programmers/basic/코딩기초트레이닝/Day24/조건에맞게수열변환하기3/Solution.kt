package programmers.basic.코딩기초트레이닝.Day24.조건에맞게수열변환하기3

class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        return arr.map { if(k%2==1) it*k else it+k}.toIntArray()
    }
}