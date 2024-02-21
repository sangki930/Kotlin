package programmers.basic.Day11.주사위의개수

class Solution {
    fun solution(box: IntArray, n: Int): Int {
        return (box[0]/n) * (box[1]/n) * (box[2]/n)
    }
}