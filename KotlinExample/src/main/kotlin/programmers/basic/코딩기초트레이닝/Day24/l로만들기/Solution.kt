package programmers.basic.코딩기초트레이닝.Day24.l로만들기

class Solution {
    fun solution(myString: String): String {
        return myString.map{if(it < 'l') 'l' else it}.joinToString("")
    }
}