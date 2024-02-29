package programmers.basic.Day14.암호해독

class Solution {
    fun solution(cipher: String, code: Int): String = (0 until cipher.length).filter { it%code == code-1 }.map { cipher[it] }.joinToString("")
}