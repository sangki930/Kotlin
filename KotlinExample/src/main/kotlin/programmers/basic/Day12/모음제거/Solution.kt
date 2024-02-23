package programmers.basic.Day12.모음제거

class Solution {
    fun solution(myString: String) = myString.replace("a|e|i|o|u".toRegex(), "")
}