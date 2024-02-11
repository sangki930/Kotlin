package programmers.basic.Day09.부분문자열이어붙여문자열만들기

class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        for(i in 0 until my_strings.size){
            answer+=my_strings[i].substring(parts[i][0],parts[i][1]+1)
        }
        return answer
    }
}