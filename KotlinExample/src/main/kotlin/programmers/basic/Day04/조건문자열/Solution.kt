package programmers.basic.Day04.조건문자열

class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        return when{
            ineq == ">" && eq == "=" -> judge(n>=m)
            ineq == "<" && eq == "=" -> judge(n<=m)
            ineq == ">" && eq == "!" -> judge(n>m)
            ineq == "<" && eq == "!" -> judge(n<m)
            else -> -1
        }
    }

    fun judge(b : Boolean):Int = if(b){
        1
    }else{
        0
    }
}