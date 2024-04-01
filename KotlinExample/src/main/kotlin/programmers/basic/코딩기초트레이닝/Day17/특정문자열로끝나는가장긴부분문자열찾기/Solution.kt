package programmers.basic.코딩기초트레이닝.Day17.특정문자열로끝나는가장긴부분문자열찾기

class Solution {
    fun solution(myString: String, pat: String): String {
        return myString.substring(0,myString.lastIndexOf(pat))+pat
    }
}