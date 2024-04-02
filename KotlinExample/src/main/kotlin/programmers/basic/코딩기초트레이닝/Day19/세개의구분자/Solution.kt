package programmers.basic.코딩기초트레이닝.Day19.세개의구분자


internal class Solution {
    fun solution(myStr: String): List<*> {
        val list: MutableList<String> = ArrayList()
        var temp = ""
        for (i in 0 until myStr.length) {
            val value = myStr[i]

            if (value == 'a' || value == 'b' || value == 'c') {
                //빈 스트링이 아니고 이미 저장해온 값이 있다면?
                if (temp !== "") {
                    list.add(temp)
                    temp = ""
                }
            } else {
                temp += value
            }
        }
        if (temp !== "") {
            list.add(temp)
            temp = ""
        }

        if (list.size == 0) list.add("EMPTY")
        return list
    }
}