package programmers.basic.코딩기초트레이닝.Day13.왼쪽오른쪽

class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        if(!str_list.contains("l") && !str_list.contains("r")) return answer

        for(i in 0 until str_list.size){
            if(str_list[i] == "l"){
                answer = str_list.slice(0 until i).toTypedArray();
                break;
            }else if(str_list[i] == "r"){
                answer = str_list.slice(i+1 until str_list.size).toTypedArray();
                break;
            }
        }

        return answer
    }
}