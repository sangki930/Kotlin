package programmers.basic.Day12.첫번째로나오는음수

class Solution {
    fun solution(num_list: IntArray): Int {
        return num_list.indexOfFirst { it < 0 }
    }
}
