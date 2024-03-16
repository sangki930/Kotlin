package programmers.basic.Day23.특이한정렬

data class Data(var v : Int, var d : Int)
class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var list = mutableListOf<Data>()
        for((i,v) in numlist.withIndex()){
            list.add(Data(v, Math.abs(v - n)))
        }
        list.sortWith(compareBy<Data> { it.d }.thenComparing { o1, o2 -> o2.v-o1.v })
        for(da in list){
            answer += da.v
        }
        return answer
    }
}