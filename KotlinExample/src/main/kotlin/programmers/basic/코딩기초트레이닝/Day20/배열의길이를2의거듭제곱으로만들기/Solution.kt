package programmers.basic.코딩기초트레이닝.Day20.배열의길이를2의거듭제곱으로만들기

import kotlin.math.ceil
import kotlin.math.log2

class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = IntArray(Math.pow(2.0, ceil(log2(arr.size.toDouble()))).toInt())
        for(i in arr.indices){
            answer[i] = arr[i]
        }
        return answer
    }
}