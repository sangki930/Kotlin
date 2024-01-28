package programmers.basic.코딩기초트레이닝.Day02.문자열겹쳐쓰기

class Solution1 {
    fun solution(myString: String, overwriteString: String, s: Int): String =
        myString.replaceRange(s, s + overwriteString.length, overwriteString)
}