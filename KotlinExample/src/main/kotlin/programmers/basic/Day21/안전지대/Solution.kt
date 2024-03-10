package programmers.basic.Day21.안전지대


class Solution {
    fun solution(board: Array<IntArray>): Int {
        val list = ArrayList<IntArray>()
        var answer = 0
        val dx = intArrayOf(0, 1, -1, 0, -1, 1, 1, -1)
        val dy = intArrayOf(1, 0, 0, -1, -1, 1, -1, 1)

        for (i in board.indices) {
            for (j in board[0].indices) {
                if (board[i][j] == 1) {
                    val temp = intArrayOf(i, j)
                    list.add(temp)
                }
            }
        }

        for (a in list.indices) {
            val i = list[a][0]
            val j = list[a][1]
            for (k in 0..7) {
                if (dx[k] + i >= 0 && dy[k] + j >= 0 && dx[k] + i <= board.size - 1 && dy[k] + j <= board.size - 1) board[dx[k] + i][dy[k] + j] =
                    1
            }
        }

        for (i in board.indices) {
            for (j in board[0].indices) {
                if (board[i][j] == 0) answer += 1
            }
        }
        return answer
    }
}