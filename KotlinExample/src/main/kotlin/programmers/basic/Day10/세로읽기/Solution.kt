package programmers.basic.Day10.세로읽기

class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        var answer: String = ""
        for(i in c-1..my_string.length-1 step m){
            answer += my_string[i]
        }
        return answer
    }
}