package programmers.basic.코딩기초트레이닝.Day09.접미사배열

class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        var n = my_string.length
        for(i in 0 until n){
            answer+=my_string.substring(i,n)
        }
        answer.sort()
        return answer
    }
}