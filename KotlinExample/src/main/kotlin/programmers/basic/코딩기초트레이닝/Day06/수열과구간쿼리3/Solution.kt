package programmers.basic.코딩기초트레이닝.Day06.수열과구간쿼리3

class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        for(q in queries){
            var tmp = arr[q[0]]
            arr[q[0]] = arr[q[1]]
            arr[q[1]] = tmp
        }
        return answer
    }
}