package programmers.basic.Day17.OX퀴즈

class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for(i in quiz.indices){
            var input = quiz[i].split(" ")
            var (a,b,c,d,e) = input

            if(b == "-"){
                if(a.toInt() - c.toInt() == e.toInt()){
                    answer += "O"
                }else answer += "X"
            } else if(b == "+"){
                if(a.toInt() + c.toInt() == e.toInt()){
                    answer += "O"
                }else answer += "X"
            }
        }
        return answer
    }
}