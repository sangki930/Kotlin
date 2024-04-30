package programmers.basic.코딩기초트레이닝.Day25.이차원배열대각선순회하기

class Solution {
    fun solution(board: Array<IntArray>, k: Int): Int {
        var answer: Int = 0
        for(i in 0 until board.size){
            for(j in 0 until board[0].size){
                if(i+j<=k) answer += board[i][j]
            }
        }
        return answer
    }
}