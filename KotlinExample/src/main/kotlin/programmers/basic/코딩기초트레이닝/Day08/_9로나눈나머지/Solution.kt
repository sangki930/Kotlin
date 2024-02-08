package programmers.basic.코딩기초트레이닝.Day08._9로나눈나머지

class Solution {
    fun solution(number: String): Int = number.map{it-'0'}.sum()%9
}