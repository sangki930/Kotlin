package programmers.basic.코딩기초트레이닝.Day20.배열의길이에따라다른연산하기

class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        return if(arr.size % 2 == 0){
            arr.indices.map { if(it%2==1) arr[it]+n else arr[it] }.toIntArray()
        }else{
            arr.indices.map { if(it%2==0) arr[it]+n else arr[it] }.toIntArray()
        }
    }
}