package programmers.basic.Day20.다항식더하기

internal class Solution {
    fun solution(polynomial: String): String {
        var xNum = 0
        var num = 0

        for (s in polynomial.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()) {
            if (s.contains("x")) // x가 있으면
                xNum += if (s == "x") 1 else s.replace("x".toRegex(), "").toInt()
            else if (s != "+") num += s.toInt()
        }

        return ((if (xNum != 0) if (xNum > 1) xNum.toString() + "x" else "x" else "")
                + (if (num != 0) (if (xNum != 0) " + " else "")
                + num else if (xNum == 0) "0" else ""))
    }
}