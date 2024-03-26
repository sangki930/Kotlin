package programmers.basic.코딩기초트레이닝.Day16.배열에서문자열대소문자변환하기

class Solution {
    fun solution(strArr: Array<String>): Array<String> = strArr.mapIndexed { index: Int, s: String -> if(index%2==0) s.lowercase() else s.uppercase()}.toTypedArray()
}