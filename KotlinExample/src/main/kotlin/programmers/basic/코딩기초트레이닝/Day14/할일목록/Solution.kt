package programmers.basic.코딩기초트레이닝.Day14.할일목록

class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        return todo_list.filterIndexed { index, s -> finished[index] }.toTypedArray()
    }
}