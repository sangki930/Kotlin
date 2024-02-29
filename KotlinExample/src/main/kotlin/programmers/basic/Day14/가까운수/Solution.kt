package programmers.basic.Day14.가까운수

import kotlin.math.*

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = Integer.MAX_VALUE
        var num = Integer.MAX_VALUE-n
        for(i in array){
            if(num>abs(i-n)){
                num = abs(i-n)
                answer = i
            }else if(num==abs(i-n)){
                answer = min(answer,i)
            }
        }
        return answer
    }
}