package programmers.basic.Day23.로그인성공

class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var m = mutableMapOf<String,String>()
        db.forEach {m[it[0]]=it[1]}
        return if(m.containsKey(id_pw[0])){
            if(m[id_pw[0]] == id_pw[1]){
                "login"
            }else "wrong pw"
        }else{
            "fail"
        }
    }
}