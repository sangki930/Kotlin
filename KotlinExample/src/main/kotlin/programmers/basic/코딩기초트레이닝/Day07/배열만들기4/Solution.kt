package programmers.basic.코딩기초트레이닝.Day07.배열만들기4

class Solution {
    fun solution(arr: IntArray): IntArray {
        var i = 0
        val stk = mutableListOf<Int>()
        while (i < arr.size) {
            if (stk.isEmpty()) stk.add(arr[i++])
            else if (stk.last() < arr[i]) stk.add(arr[i++])
            else if (stk.last() >= arr[i]) stk.removeLast()
        }
        return stk.toIntArray()
    }
}