package programmers.basic.코딩기초트레이닝.Day07.배열만들기

class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()

        for(i in l..r){
            if((("${i}").contains("0") || ("${i}").contains("5")) && judge("${i}")){
                answer += i
            }
        }
        if(answer.isEmpty()) answer+=-1
        return answer
    }

    fun judge(s:String):Boolean{
        var l = listOf('1','2','3','4','6','7','8','9')
        for(t in s){
            if(l.contains(t)) return false;
        }
        return true;
    }
}