package programmers.basic.코딩기초트레이닝.Day18.간단한식계산하기

class Solution {
    fun solution(binomial: String) = binomial.split(" ".toRegex()).let { (a, o, b) ->
        when (o) {
            "+" -> a.toInt() + b.toInt()
            "-" -> a.toInt() - b.toInt()
            "*" -> a.toInt() * b.toInt()
            else -> 0
        }
    }
}