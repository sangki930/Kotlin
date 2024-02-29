package programmers.basic.Day14._369게임

class Solution {
    fun solution(order: Int): Int {
        return order.toString().filter { it in "369" }.count()
    }
}