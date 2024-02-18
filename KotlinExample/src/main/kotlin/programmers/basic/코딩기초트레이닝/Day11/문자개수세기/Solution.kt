package programmers.basic.Day11.문자개수세기

class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = IntArray(52){0}
        my_string.forEach{
            if(it>='a'){
                answer[it-'a'+26]++
            }else if(it>='A'){
                answer[it-'A']++
            }
        }
        return answer
    }
}