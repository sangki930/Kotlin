package programmers.basic.Day08._9로나눈나머지

class Solution {
    fun solution(number: String): Int = number.map{it-'0'}.sum()%9
}