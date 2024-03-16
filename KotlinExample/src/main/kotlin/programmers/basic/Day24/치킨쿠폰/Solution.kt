package programmers.basic.Day24.치킨쿠폰

internal class Solution {
    fun solution(chicken: Int): Int {
        var coupon = chicken
        var count = 0

        while (coupon >= 10) {
            val leftCoupon = coupon % 10
            count += coupon / 10
            coupon = leftCoupon + coupon / 10
        }
        return count
    }
}