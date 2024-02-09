package programmers.basic.Day08.글자이어붙여문자열만들기

class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        var answer: String = ""
        for(i in index_list){
            answer += my_string[i]
        }
        return answer
    }
}