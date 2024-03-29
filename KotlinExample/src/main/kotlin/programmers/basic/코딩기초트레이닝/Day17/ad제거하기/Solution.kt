package programmers.basic.코딩기초트레이닝.Day17.ad제거하기

class Solution {
    fun solution(strArr: Array<String>): Array<String>
    = strArr.filter { !it.contains("ad") }.toTypedArray()
}