package programmers.basic.코딩기초트레이닝.Day15.조건에맞게수열변환하기2

import kotlin.math.max

class Solution {

    fun solution(arr: IntArray): Int {
        var answer = 0
        var res : IntArray = Array<Int>(arr.size) {i->0}.toIntArray()
        for(i in arr.indices){
            var num = arr[i]

            while(true){
                if(num%2==0 && num>=50){
                    num/=2
                    res[i]+=1
                }else if(num%2==1 && num<50){
                    num=num*2+1
                    res[i]+=1
                }else break
            }
            answer = max(answer,res[i])
        }
        return answer
    }
}