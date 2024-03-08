package programmers.basic.Day20.캐릭터의좌표

internal class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        val now = intArrayOf(0, 0) //현재 위치좌표
        val maxWidth = board[0] / 2 //x축 최대 좌표
        val maxLength = board[1] / 2 //y축 최대 좌표
        for (i in keyinput.indices) {
            if (keyinput[i] == "left") {            //left를 눌렀을때
                now[0] -= (if (now[0] > -(maxWidth)) 1 else 0) //x축 (-)최대좌표보다 크면 1, 아니면 0을 뺌
            } else if (keyinput[i] == "right") {    //이하 동일
                now[0] += (if (now[0] < (maxWidth)) 1 else 0)
            } else if (keyinput[i] == "down") {
                now[1] -= (if (now[1] > -(maxLength)) 1 else 0)
            } else if (keyinput[i] == "up") {
                now[1] += (if (now[1] < (maxLength)) 1 else 0)
            }
        }
        return now
    }
}