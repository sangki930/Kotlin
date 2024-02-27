package programmers.basic.Day13.삼각형의완성조건1

class Solution {
    fun solution(sides: IntArray): Int {
        sides.sort();
        return if(sides[0]+sides[1]>sides[2]) 1 else 2
    }
}