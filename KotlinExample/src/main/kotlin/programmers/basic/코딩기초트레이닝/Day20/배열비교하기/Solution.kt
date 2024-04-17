package programmers.basic.코딩기초트레이닝.Day20.배열비교하기

class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        return if(arr1.size>arr2.size){
            1
        }else if(arr1.size<arr2.size){
            -1
        }else{
            var sum1 = arr1.sum()
            var sum2 = arr2.sum()
            if(sum1>sum2){
                1
            }else if(sum1<sum2){
                -1
            }else 0
        }
    }
}