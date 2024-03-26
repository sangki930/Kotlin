package programmers.basic.코딩기초트레이닝.Day16.A강조하기

class Solution {
    fun solution(myString: String): String=myString.mapIndexed { index, c -> if(c == 'a') 'A' else if('B'<= c && c<='Z') c - ('A'-'a') else c }.joinToString("")
}