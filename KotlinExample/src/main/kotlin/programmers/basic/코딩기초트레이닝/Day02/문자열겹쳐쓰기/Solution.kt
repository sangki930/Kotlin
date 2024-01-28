package programmers.basic.코딩기초트레이닝.Day02.문자열겹쳐쓰기

class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        val ch = CharArray(2000)
        for(i in 0 until my_string.length){
            ch[i] = my_string[i]
        }
        for(i in s until s+overwrite_string.length){
            ch[i] = overwrite_string[i-s]
        }
        return String(ch).trim(){
            it <= ' '
        }
    }
}