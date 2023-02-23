package programmers.basic.Day05.아이스아메리카노

class Solution {
    private val iceAmericanoPrice = 5500
    fun solution(money: Int) = intArrayOf(money / iceAmericanoPrice, money % iceAmericanoPrice)
}