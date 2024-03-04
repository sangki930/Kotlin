package programmers.basic.Day16.문자열계산하기

class Solution {
    fun solution(myString: String) = myString.replace("- ".toRegex(), "-")
        .replace("[+] ".toRegex(), "")
        .trim()
        .split(" ".toRegex())
        .sumOf { it.toInt() }
}
