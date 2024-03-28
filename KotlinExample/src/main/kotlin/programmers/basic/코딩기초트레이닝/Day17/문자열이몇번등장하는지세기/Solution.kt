package programmers.basic.코딩기초트레이닝.Day17.문자열이몇번등장하는지세기

class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        var idx = 0
        while(idx <= myString.lastIndex) {
            idx = myString.indexOf(pat,idx)
            if(idx == -1) break;
            answer++
            idx++
        }
        return answer
    }
}