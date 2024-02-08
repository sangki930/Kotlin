package programmers.basic.Day07.각도기

class Solution {
    fun solution(angle: Int): Int {
        return when{
            angle in 1 until 90 -> 1 // 예각
            angle == 90 -> 2 // 직각
            angle in 91..179 -> 3 // 둔각
            angle == 180 -> 4 // 평각
            else -> -1 // 아무 것도 아님
        }
    }
}