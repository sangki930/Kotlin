package programmers.basic.Day02.배열두배만들기

class Solution {
    fun solution(numbers: IntArray): IntArray = numbers.map{ i->2*i }.toIntArray()
}