package programmers.basic.코딩기초트레이닝.Day19.빈배열에추가삭제하기

class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in flag.indices){
            if(flag[i]){
                for(j in 1..arr[i]) answer += arr[i]
            }else{
                answer = answer.dropLast(arr[i]).toIntArray()
            }
            println(answer.contentToString());
        }
        return answer
    }
}