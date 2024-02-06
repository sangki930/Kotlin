package programmers.basic.코딩기초트레이닝.Day07.수열과구간쿼리4

import kotlin.math.*
class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = IntArray(queries.size){0}
        for(j in 0 until queries.size){
            var q = queries[j]
            var v = Integer.MAX_VALUE
            for(i in q[0]..q[1]){
                if(i%q[2]==0){
                    arr[i]++
                }
            }

        }
        return arr
    }
}