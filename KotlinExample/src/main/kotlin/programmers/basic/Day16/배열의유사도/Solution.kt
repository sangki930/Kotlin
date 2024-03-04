package programmers.basic.Day16.배열의유사도

class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        return (s1+s2).size - (s1+s2).toSet().size
    }
}