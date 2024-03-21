package programmers.basic.코딩기초트레이닝.Day14.홀수vs짝수

class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var answer2: Int = 0
        num_list.forEachIndexed { index, i ->
            if(index % 2 == 0) {
                answer += i
            }else{
                answer2 += i
            }
        }
        return Math.max(answer, answer2);
    }
}