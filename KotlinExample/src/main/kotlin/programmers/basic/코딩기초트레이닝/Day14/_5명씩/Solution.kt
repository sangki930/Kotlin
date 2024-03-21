package programmers.basic.코딩기초트레이닝.Day14._5명씩

class Solution {
    fun solution(names: Array<String>): Array<String> {
        return (0 until names.size step 5).map { names[it]}.toTypedArray()
    }
}