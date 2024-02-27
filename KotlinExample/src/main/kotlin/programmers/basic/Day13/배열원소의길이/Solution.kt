package programmers.basic.Day13.배열원소의길이

class Solution {
    fun solution(strlist: Array<String>): IntArray = strlist.map { it.length }.toIntArray()
}