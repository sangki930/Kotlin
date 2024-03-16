package programmers.basic.Day24.A로B만들기

class Solution {
    fun solution(before: String, after: String): Int {
        return if(before.toList().sorted() == after.toList().sorted()) 1 else 0
    }
}