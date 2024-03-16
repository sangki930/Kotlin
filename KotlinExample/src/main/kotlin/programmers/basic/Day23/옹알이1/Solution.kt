package programmers.basic.Day23.옹알이1

internal class Solution {
    var banList: Array<String> = arrayOf("ayaaya", "yeye", "woowoo", "mama")
    var speakingList: Array<String> = arrayOf("aya", "ye", "woo", "ma")
    fun solution(babbling: Array<String>): Int {
        var answer = 0

        for (str in babbling) {
            var tempStr = str
            for (ban in banList) {
                tempStr = tempStr.replace(ban, "z")
            }
            for (speak in speakingList) {
                tempStr = tempStr.replace(speak, "")
            }
            if (tempStr.length == 0) {
                answer++
            }
        }
        return answer
    }
}