package programmers.basic.Day09.접미사인지확인하기

class Solution {
    fun solution(myString: String, isSuffix: String) = if (myString.endsWith(isSuffix)) 1 else 0
}