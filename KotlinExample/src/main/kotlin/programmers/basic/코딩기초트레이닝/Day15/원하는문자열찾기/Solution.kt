package programmers.basic.코딩기초트레이닝.Day15.원하는문자열찾기

class Solution {
    fun solution(myString: String, pat: String): Int {
        return if(myString.toLowerCase().contains(pat.toLowerCase())) 1 else 0
    }
}