package programmers.basic.Day10.공던지기

class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var idx: Int = 0
        var len = numbers.size
        for(i in 1..k-1){
            idx = (idx+2)%len
        }
        return idx+1
    }
}