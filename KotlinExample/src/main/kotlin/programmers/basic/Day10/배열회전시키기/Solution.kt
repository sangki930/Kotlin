package programmers.basic.Day10.배열회전시키기

class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        val n = numbers.size
        var answer = IntArray(n, { 0 } )
        return if(direction=="right"){
            answer[0] = numbers[numbers.size-1]
            for(i in 1..n-1)
                answer[i] = numbers[i-1]
            answer
        }
        else if(direction=="left"){
            answer[n-1] = numbers[0]
            for(i in 1..n-1)
                answer[i-1] = numbers[i]
            answer
        }
        else{
            answer
        }
    }
}