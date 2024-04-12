package programmers.basic.코딩기초트레이닝.Day19.배열만들기6

class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var i = 0
        while(i<arr.size){
            if(answer.isEmpty()){
                answer += arr[i]
            }else{
                if(answer[answer.size-1]==arr[i]){
                    answer = answer.dropLast(1).toIntArray()
                }else{
                    answer += arr[i]

                }
            }
            i++
        }
        if(answer.isEmpty()) return intArrayOf(-1)
        return answer
    }
}