package programmers.basic.코딩기초트레이닝.Day24.그림확대

class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        for(row in picture){
            var resized : String = ""
            for(pixel in row){
                resized += pixel.toString().repeat(k)
            }
            for(i in 0 until k){
                answer += resized
            }
        }

        return answer
    }
}