package programmers.basic.코딩기초트레이닝.Day24.커피심부름

class Solution {
    fun solution(order: Array<String>): Int {
        return order.map {
            if(it.contains("cafelatte")) 5000
            else 4500
        }.sum()
    }
}