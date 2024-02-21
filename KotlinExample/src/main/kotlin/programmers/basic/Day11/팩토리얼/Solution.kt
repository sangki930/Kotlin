package programmers.basic.Day11.팩토리얼

class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        for(i in 0 until numbers.size)
            for(j in 0 until numbers.size)
                if(i != j)
                    answer = Math.max(answer,numbers[i]*numbers[j])
        return answer
    }
}