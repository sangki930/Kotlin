package programmers.basic.Day13.중복된문자제거

class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        for(s in my_string){
            if(!answer.contains(s)) answer+=s
        }
        return answer
    }
}