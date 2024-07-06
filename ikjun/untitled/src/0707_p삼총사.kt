class Solution {
    fun solution(arr: IntArray): Int {
        var result = 0

        val combinations = mutableListOf<List<Int>>()

        for (i in 0 until arr.size) {
            for (j in i + 1 until arr.size) {
                for (k in j + 1 until arr.size) {
                    println("i: $i, j: $j, k: $k") // 현재 인덱스를 출력
                    combinations.add(listOf(arr[i], arr[j], arr[k]))
                }
            }
        }

        val sums = combinations.map { it.sum() }
        result = sums.filter { it == 0 }.size


        return result

    }
}