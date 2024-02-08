package programmers.basic.코딩기초트레이닝.Day08.문자열여러번뒤집기

class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string
        for(query in queries){
            answer = answer.substring(0,query[0]) + answer.substring(query[0],query[1]+1).reversed()+answer.substring(query[1]+1);
        }
        return answer
    }
}