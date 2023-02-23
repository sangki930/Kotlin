package programmers.basic.Day05.옷가게할인받기

class Solution {
    fun solution(price: Int): Int = if(100000<=price && price<300000){
        (price * 0.95).toInt()
    }else if(300000<=price && price<500000){
        (price * 0.9).toInt()
    }else {
        (price * 0.8).toInt()
    }
}