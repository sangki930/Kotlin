package programmers.basic.코딩기초트레이닝.Day05.코드처리하기

class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode = 0
        for(i in 0 until code.length){
            var e = code[i]
            if(e=='1'){
                if(mode == 1){
                    mode = 0
                }else if(mode == 0){
                    mode = 1
                }
            }else{
                if(mode == 0){
                    if(i%2==0){
                        answer+=e
                    }
                }else{
                    if(i%2==1){
                        answer+=e
                    }
                }
            }
        }
        if(answer === "") return "EMPTY"
        return answer
    }
}