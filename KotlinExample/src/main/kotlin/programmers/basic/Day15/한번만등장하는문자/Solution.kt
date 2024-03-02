package programmers.basic.Day15.한번만등장하는문자

import java.util.*

class Solution {
    fun solution(s: String): String {
        var m = TreeMap<Char,Int>()
        s.forEachIndexed { index, c -> m[s[index]] = m.getOrDefault(s[index],0) + 1 }
        return m.keys.filter { m[it] == 1 }.joinToString("")
    }
}