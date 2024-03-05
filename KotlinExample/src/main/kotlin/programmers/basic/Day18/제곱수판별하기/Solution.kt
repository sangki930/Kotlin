package programmers.basic.Day18.제곱수판별하기

import kotlin.math.*;

class Solution {
    fun solution(n: Int): Int {
        val sqrt = sqrt(n.toDouble()).toLong()
        return if(sqrt*sqrt == n.toLong()) 1 else 2
    }
}
