package programmers.basic.Day08.주사위게임3

import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val map = listOf(a, b, c, d).groupingBy { it }.eachCount()
        return when (map.maxOf { it.value }) {
            4 -> a * 1111

            3 -> {
                val p = map.entries.first { it.value == 3 }.key
                val q = map.entries.first { it.value == 1 }.key
                (10 * p + q).let { it * it }
            }

            2 -> {
                if (map.size == 2) {
                    val p = map.entries.first { it.value == 2 }.key
                    val q = map.entries.last { it.value == 2 }.key
                    (p + q) * abs(p - q)
                } else {
                    map.entries.filter { it.value != 2 }
                        .map { it.key }
                        .reduce { acc, n -> acc * n }
                }
            }

            else -> map.minOf { it.key }
        }
    }
}