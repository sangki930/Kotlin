package programmers.basic.코딩기초트레이닝.Day03.두수연산값비교하기

import kotlin.math.max

class Solution {
    fun solution(a: Int, b: Int): Int = max((a.toString()+b.toString()).toInt(),2*a*b)
}