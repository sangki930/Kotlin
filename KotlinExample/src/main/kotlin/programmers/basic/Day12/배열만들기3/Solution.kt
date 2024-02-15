package programmers.basic.Day12.배열만들기3

class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        return intervals.flatMap { (left, right) -> arr.slice(left..right) }.toIntArray()
    }
}