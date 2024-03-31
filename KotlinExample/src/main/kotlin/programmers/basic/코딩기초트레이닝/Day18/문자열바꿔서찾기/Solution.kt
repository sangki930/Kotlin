package programmers.basic.코딩기초트레이닝.Day18.문자열바꿔서찾기

class Solution {
    fun solution(myString: String, pat: String): Int = if(myString.replace("A","T").replace("B","A").replace("T","B").contains(pat)) 1 else 0
}