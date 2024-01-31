package programmers.basic.코딩기초트레이닝.Day03

class Solution {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
        var l: Int = str1.length+str2.length
        var j: Int = 0
        var k: Int = 0
        for(i in 0 until l){
            if(i%2==0){
                answer+=str1[j++]
            }else{
                answer+=str2[k++]
            }
        }
        return answer
    }
}