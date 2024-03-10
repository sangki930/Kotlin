package programmers.basic.Day21.외계어사전

class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        val answer = 2
        for (str in dic) {
            var flag = true
            for (sp in spell) {
                if (!str.contains(sp!!)) flag = false
            }
            if (flag) return 1
        }

        return answer
    }
}