package programmers.basic.코딩기초트레이닝.Day20.문자열묶기

class Solution1 {
    fun solution(strArr: Array<String>) = strArr.groupBy(String::length).values.maxOf(List<String>::size)
}