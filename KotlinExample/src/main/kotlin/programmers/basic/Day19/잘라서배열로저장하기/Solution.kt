package programmers.basic.Day19.잘라서배열로저장하기

class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        var cnt = (Math.ceil(1.0*my_str.length/n)).toInt()
        var answer=Array(cnt,{""})
        for(i in 0 until cnt)
            answer[i] = my_str.substring(i*n until Math.min(i*n+n,my_str.length))
        return answer
    }
}