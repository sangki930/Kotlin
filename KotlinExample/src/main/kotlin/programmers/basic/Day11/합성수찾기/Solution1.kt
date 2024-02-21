package programmers.basic.Day11.합성수찾기

class Solution1 {
    fun solution(n: Int) = (1..n).filter { i -> (1..i).filter { i % it == 0 }.size > 2 }.size
}