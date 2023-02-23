package programmers.basic.Day02.분수의덧셈

class Solution {
    tailrec fun gcd(a: Int, b: Int): Int  = if (b == 0) a else gcd(b, a % b)
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var numer3 = (numer1*denom2)+(numer2*denom1)
        var denom3 = (denom1*denom2)
        val gcd_v = gcd(numer3,denom3)
        return intArrayOf(numer3/gcd_v,denom3/gcd_v)
    }
}