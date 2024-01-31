package programmers.basic.코딩기초트레이닝.Day03.더크게합치기

import kotlin.math.max

class Solution {
    fun solution(a: Int, b: Int): Int = max((a.toString()+b.toString()).toInt(),(b.toString()+a.toString()).toInt())

}