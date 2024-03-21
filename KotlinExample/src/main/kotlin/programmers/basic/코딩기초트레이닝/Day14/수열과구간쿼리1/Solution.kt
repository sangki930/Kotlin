package programmers.basic.코딩기초트레이닝.Day14.수열과구간쿼리1

class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for(query in queries){
            for(i in query[0] .. query[1]){
                arr[i]++
            }
        }
        return arr
    }
}