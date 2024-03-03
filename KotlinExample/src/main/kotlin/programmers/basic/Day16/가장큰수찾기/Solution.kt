package programmers.basic.Day16.가장큰수찾기

class Solution {
    fun solution(array: IntArray): IntArray {
        var answer: IntArray = IntArray(2)
        for(i in 0 until array.size){
            if(answer[0] < array[i]){
                answer[0] = array[i]
                answer[1] = i
            }
        }
        return answer
    }
}