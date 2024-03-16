package programmers.basic.Day24.이진수더하기

class Solution {
    fun solution(bin1: String, bin2: String): String {
        return (Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2)).toString(2)
    }
}