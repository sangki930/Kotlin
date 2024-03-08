package programmers.basic.Day20.직사각형넓이구하기

class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val coordX = dots.map { it[0] }.toSortedSet()
        val coordY = dots.map { it[1] }.toSortedSet()

        return (coordX.last() - coordX.first()) * (coordY.last() - coordY.first())
    }
}