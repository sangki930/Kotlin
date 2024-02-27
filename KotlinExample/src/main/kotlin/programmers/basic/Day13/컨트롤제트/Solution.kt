package programmers.basic.Day13.컨트롤제트

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var arr = s.split(' ').toMutableList()
        while(arr.contains("Z")){
            arr.removeAt(arr.indexOf("Z")-1)
            arr.removeAt(arr.indexOf("Z"))
        }
        for (i in arr.indices) answer += arr[i].toInt()

        return answer
    }
}