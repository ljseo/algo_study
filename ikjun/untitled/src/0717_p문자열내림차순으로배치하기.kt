class Solution {
    fun solution(s: String): String {
        val chars = s.toCharArray()
        chars.sort()
        return chars.reversed().joinToString("")
    }
}