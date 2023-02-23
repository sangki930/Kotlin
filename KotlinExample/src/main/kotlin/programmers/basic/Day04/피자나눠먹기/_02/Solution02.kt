package programmers.basic.Day04.피자나눠먹기._02

class Solution02 {
    fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a
    fun lcm(a: Int, b:Int): Int = (a * b) / gcd(a, b)
    fun solution(n: Int): Int {
        return lcm(6, n) / 6
    }
}